package lab11;

import java.net.URL;
import java.util.ResourceBundle;

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

public class StopWatch_start_controller implements Initializable {

	public VBox start_gui;
	public Label timeField;
	public Button startbutton;
	public TableView <String> table;
	public TableColumn <String, String> num, time, total;

	public void startAction() throws Exception {
			try {
				Stage primaryStage = (Stage) startbutton.getScene().getWindow();
				Parent login = FXMLLoader.load(getClass().getResource("/lab11/StopWatch_timer_Gui.fxml"));
				Scene scene = new Scene(login);
				primaryStage.setTitle("StopWatch");
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
