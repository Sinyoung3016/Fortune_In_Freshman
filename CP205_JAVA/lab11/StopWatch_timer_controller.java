package lab11;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class StopWatch_timer_controller implements Initializable {

	public VBox stoplap_gui;
	public Label timeField, nowlap;
	public Button stopbutton, laptimebutton;
	public TableView<Model> table;
	public TableColumn<Model, Integer> num;
	public TableColumn<Model, String> time, total;
	private long start, end, scopy, ing;
	private Timeline timeline;
	private String recode = "00:00:00.000";

	ObservableList<Model> list = FXCollections.observableArrayList();

	public void stopAction() {
		if (stopbutton.getText().equals("일시정지")) {
			timeline.stop();
			stopbutton.setText("시작");
			laptimebutton.setText("초기화");
		} else if (stopbutton.getText().equals("시작")) {
			timeline.play();
			stopbutton.setText("일시정지");
			laptimebutton.setText("랩타임");
		}
	}

	public void laptimeAction() {
		if (laptimebutton.getText().equals("랩타임")) {
			ing = end;
			long secs = (ing - scopy);
			int milli = (int) secs % 1000;
			int sec = (int) secs / 1000 % 60;
			int min = (int) secs / 1000 / 60 % 60;
			int hour = (int) secs / 1000 / 60 / 60;
			String newrecode = String.format("%02d:%02d:%02d.%03d", hour, min, sec, milli);
			scopy = ing;

			list.add(new Model(new SimpleIntegerProperty(list.size() + 1), new SimpleStringProperty(newrecode),
					new SimpleStringProperty(recode)));
			num.setCellValueFactory(cellData -> cellData.getValue().numProperty().asObject());
			time.setCellValueFactory(cellData -> cellData.getValue().timeProperty());
			total.setCellValueFactory(cellData -> cellData.getValue().totalProperty());
			table.setItems(list);
			nowlap.setText("현재 랩 : " + recode);

		} else if (laptimebutton.getText().equals("초기화")) {
			list.clear();
			table.setItems(list);

			try {
				Stage primaryStage = (Stage) laptimebutton.getScene().getWindow();
				Parent login = FXMLLoader.load(getClass().getResource("/lab11/StopWatch_start_Gui.fxml"));
				Scene scene = new Scene(login);
				primaryStage.setTitle("StopWatch");
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		start = System.currentTimeMillis();
		scopy = start;
		timeline = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				end = System.currentTimeMillis();
				long secs = (end - start);
				int milli = (int) secs % 1000;
				int sec = (int) secs / 1000 % 60;
				int min = (int) secs / 1000 / 60 % 60;
				int hour = (int) secs / 1000 / 60 / 60;
				recode = String.format("%02d:%02d:%02d.%03d", hour, min, sec, milli);
				timeField.setText(String.format(recode));
			}
		}));
		timeline.setCycleCount(Timeline.INDEFINITE);
		timeline.setAutoReverse(false);
		timeline.play();
	}

	private class Model {
		private IntegerProperty num;
		private StringProperty time;
		private StringProperty total;

		@SuppressWarnings("exports")
		public Model(IntegerProperty num, StringProperty time, StringProperty total) {
			this.num = num;
			this.time = time;
			this.total = total;
		}

		@SuppressWarnings("exports")
		public StringProperty timeProperty() {
			return time;
		}

		@SuppressWarnings("exports")
		public StringProperty totalProperty() {
			return total;
		}

		@SuppressWarnings("exports")
		public IntegerProperty numProperty() {
			return num;
		}
	}
}
