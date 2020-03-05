package lab09_P;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

import java.time.LocalDate;
import javafx.application.Platform;

import javafx.collections.*;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class input_controller implements Initializable {

	@FXML
	public DatePicker endDatePicker;
	@FXML
	public TextField titleField;
	@FXML
	public TextField passwordField;
	@FXML
	public ChoiceBox<String> publicBox;
	@FXML
	public TextArea contentsArea;

	@FXML
	public void registerAction() {
		StringBuilder sb = new StringBuilder();
		String title = titleField.getText();
		String password = passwordField.getText();
		sb.append("���� : " + title + "\n");
		sb.append("��й�ȣ : " + password + "\n");
		LocalDate enddate = endDatePicker.getValue();
		if (enddate != null)
			sb.append("�������� : " + enddate.toString() + "\n");
		String contents = contentsArea.getText();
		sb.append("���� : " + contents + "\n");
		System.out.println(sb);
	}

	@FXML
	public void cancelAction() {
		Platform.exit();
	};

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList<String> publicComboList = FXCollections.observableArrayList("����", "�����");
		publicBox.setItems(publicComboList);
	}
}
