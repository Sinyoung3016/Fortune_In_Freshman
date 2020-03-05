package lab10_P;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PhotoAlbum_Controller implements Initializable {

	@FXML
	public ImageView main;
	@FXML
	public Button left;
	@FXML
	public Button right;

	private Image[] images = { 
			new Image(getClass().getResource("cat-1151519_1920.jpg").toString()),
			new Image(getClass().getResource("cat-814952_1920.jpg").toString()) };

	private int index;
	
	@FXML
	public void goLeft() {
		if(index == 0)
			index = images.length;
		main.setImage(images[--index]);
	}

	@FXML
	public void goRight() {
		if(index == images.length - 1)
			index = -1;
		main.setImage(images[++index]);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		index = 0;
		main.setImage(images[0]);
	}
}
