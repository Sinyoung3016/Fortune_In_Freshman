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
	 * ������ ����
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
			addMessage("[�����]");
			sendButton.setDisable(true);
		});
		StackPane root = (StackPane) chatPane.getScene().getRoot();
		// ȭ�� �̵��� �ִϸ��̼�
		chatPane.setTranslateY(0); // ���۰��� ȭ�� ���̸�ŭ ����

		Timeline timeline = new Timeline();
		KeyValue keyValue = new KeyValue(chatPane.translateYProperty(), root.getHeight());
		KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), event -> {
			// stackPane�� ä��ȭ���� �ø���.
			root.getChildren().remove(chatPane);
		}, keyValue);
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}

	/**
	 * �ʵ��� �ؽ�Ʈ�� �޾Ƽ� msg ����
	 */
	public void sendAction() {
		send(messageField.getText());
	}

	/**
	 * socket�� ������ ������.
	 */
	void startClient() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				try {
					socket = new Socket();
					socket.connect(new InetSocketAddress(address, portNumber));
					Platform.runLater(() -> {
						addMessage("[�����]");
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
	 * socket�� ���� msg�� �޾ƿ�
	 */
	void receive() {
		while (true) {
			try {
				byte[] bytes = new byte[512];
				InputStream inputStream = socket.getInputStream();
				// ������ ������������ �������� ��� IOException �߻�
				int readByteCount = inputStream.read(bytes);
				// ������ ���������� Socket�� close()�� ȣ������ ���
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
	 * socket�� ���� msg�� ����
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
	 * ���� ����� �ȵ� ��, socket�� ����
	 */
	void disconnectServer() {
		Platform.runLater(() -> addMessage("[���� ��� �ȵ�]"));
		if (!socket.isClosed()) {
			closeAction();
		}
	}

	/**
	 * �޽����� ä�� ��Ͽ� �߰��ϴ� �޼ҵ�
	 * @param msg
	 */
	private void addMessage(String msg) {
		Text text = new Text(msg);
		// ä�ú��� �ʺ� �°� �ڵ����� ������ �ٹٲ����ִ� ���ε��� �����Ѵ�.
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
