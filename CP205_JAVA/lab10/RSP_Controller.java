package lab10;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RSP_Controller implements Initializable {
	@FXML
	public RadioButton Scissor, Rock, Paper;
	@FXML
	public Button resultButton;
	@FXML
	public ImageView ComputerScreen, PlayerScreen;
	@FXML
	public Label resultField;

	Random random = new Random();

	private Image[] i = {
			// ���ڱ�
			new Image(getClass().getResource("KakaoTalk_20191105_123825338_01.jpg").toString()),
			// �ָ�
			new Image(getClass().getResource("KakaoTalk_20191105_123825338_02.jpg").toString()),
			// ����
			new Image(getClass().getResource("KakaoTalk_20191105_123825338_03.jpg").toString()) };

	public void resultAction() {
		int k;
		String answer = "";
		int n = (int) random.nextInt(2);
		ComputerScreen.setImage(i[n]);

		if (Rock.isSelected())
			k = 1;
		else if (Paper.isSelected())
			k = 0;
		else
			k = 2;

		PlayerScreen.setImage(i[k]);

		if (n == k)
			answer = "��� : ���º�";
		else if (n == 0) { // ��
			if (k == 1) // ����
				answer = "��� : Computer �¸�";
			else if (k == 2) // ����
				answer = "��� : Player �¸�";
		}
		else if (n == 1) { // ����
			if (k == 0) // ��
				answer = "��� : Player �¸�";
			else if (k == 2) // ����
				answer = "��� : Computer �¸�";
		}
		else if (n == 2) { // ����
			if (k == 0) // ��
				answer = "��� : Computer �¸�";
			else if (k == 1) // ����
				answer = "��� : Player �¸�";
		}
		resultField.setText(answer);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ToggleGroup group = new ToggleGroup();
		Scissor.setToggleGroup(group);
		Rock.setToggleGroup(group);
		Paper.setToggleGroup(group);
		
		Scissor.setSelected(true);
	}

}
