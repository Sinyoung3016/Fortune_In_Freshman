package lab11_P;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class clock_controller implements Initializable {
	@FXML
	public Label show;
	@FXML
	public Button start; 
	@FXML
	public Button stop;
	private boolean isStopped;

	@FXML
	public void startaction() {
		isStopped = false;
		Thread thread = new Thread() {
			public void run() {
				SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
				while (!isStopped) {
					String strTime = format.format(new Date());
					Platform.runLater(() -> show.setText(strTime));
					try {
						Thread.sleep(100);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}	
				}
			};
		};
		thread.start();
	}

	@FXML
	public void stopaction() {
		this.isStopped = true;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
}
