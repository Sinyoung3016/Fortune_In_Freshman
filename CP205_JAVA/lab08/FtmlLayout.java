package lab08;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class FtmlLayout extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/lab08/FtmlLayout.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setTitle("충남대학교 로그인");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
