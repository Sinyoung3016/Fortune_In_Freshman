package lab14.hw1.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class SocketClientController implements Initializable {
	public VBox chatPane;
	public ListView<Text> chatView;
	public TextField messageField;
	public Button sendButton;

	private ObservableList<Text> chatList;
	private String address;
	private int portNumber;
	private String nickname;
	private Socket socket;

	public SocketClientController(String address, int portNumber, String nickname) {
		this.address = address;
		this.portNumber = portNumber;
		this.nickname = nickname;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		chatList = FXCollections.observableArrayList();
		chatView.setItems(chatList);
		messageField.textProperty().addListener((observable, oldValue, newValue) -> {
			if (newValue.length() > 0) {
				sendButton.setDisable(false);
			} else {
				sendButton.setDisable(true);
			}
		});
		messageField.setOnKeyReleased(event -> {
			if (event.getCode() == KeyCode.ENTER) {
				sendAction();
			}
		});
		startClient();
	}

	/**
	 * 소켓을 닫음
	 */
	public void closeAction() {
		try {
			if (socket != null && !socket.isClosed()) {
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		Platform.runLater(() -> {
			addMessage("[종료됨]");
			sendButton.setDisable(true);
		});
		StackPane root = (StackPane) chatPane.getScene().getRoot();
		// 화면 이동시 애니메이션
		chatPane.setTranslateY(0); // 시작값을 화면 높이만큼 설정

		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(chatPane.translateYProperty(), root.getHeight());
		KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), event -> {
			// stackPane에 채팅화면을 올린다.
			root.getChildren().remove(chatPane);
		}, keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}

	/**
	 * 필드의 텍스트를 받아서 msg 전송
	 */
	public void sendAction() {
		send(messageField.getText());
	}

	/**
	 * socket과 서버를 연결함.
	 */
	void startClient() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress(address, portNumber));
					Platform.runLater(() -> {
						addMessage("[연결됨]");
					});
				} catch (IOException e) {
					disconnectServer();
				}
				receive();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

	/**
	 * socket을 통해 msg를 받아옴
	 */
	void receive() {
		while (true) {
			try {
				byte[] bytes = new byte[512];
				InputStream inputStream = socket.getInputStream();
				// 서버가 비정상적으로 종료했을 경우 IOException 발생
				int readByteCount = inputStream.read(bytes);
				// 서버가 정상적으로 Socket의 close()를 호출했을 경우
				if (readByteCount == -1) {
					throw new IOException();
				}
				String data = new String(bytes, 0, readByteCount, StandardCharsets.UTF_8);
				Platform.runLater(() -> {
					addMessage(data);
				});
			} catch (IOException e) {
				disconnectServer();
				break;
			}
		}
	}

	/**
	 * socket을 통해 msg를 보냄
	 * @param msg
	 */
	void send(String msg) {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					byte[] bytes = (nickname + ": " + msg).getBytes(StandardCharsets.UTF_8);
					OutputStream outputStream = socket.getOutputStream();
					outputStream.write(bytes);
					outputStream.flush();
					Platform.runLater(() -> {
						messageField.setText("");
						messageField.requestFocus();
					});
				} catch (IOException e) {
					e.printStackTrace();
					disconnectServer();
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

	/**
	 * 서버 통신이 안될 때, socket을 닫음
	 */
	void disconnectServer() {
		Platform.runLater(() -> addMessage("[서버 통신 안됨]"));
		if (!socket.isClosed()) {
			closeAction();
		}
	}

	/**
	 * 메시지를 채팅 목록에 추가하는 메소드
	 * @param msg
	 */
	private void addMessage(String msg) {
		Text text = new Text(msg);
		// 채팅뷰의 너비에 맞게 자동으로 내용을 줄바꿈해주는 바인딩을 설정한다.
		text.wrappingWidthProperty().bind(new DoubleBinding() {
			@Override
			protected double computeValue() {
				return chatView.getPrefWidth();
			}
		});
		chatList.add(text);
		chatView.scrollTo(chatList.size());
	}
}
