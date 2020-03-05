package lab09_P;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class input_Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception 	{
		try {
		Parent root = FXMLLoader.load(getClass().getResource("/lab09_P/notion.fxml"));
		primaryStage.setTitle("input");
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	} catch(Exception e) {
		e.printStackTrace();
	}
}

	public static void main(String[] args) {
		launch(args);
	}

}