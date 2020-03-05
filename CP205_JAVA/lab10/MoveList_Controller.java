package lab10;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class MoveList_Controller implements Initializable {

	public Button moveRight, moveAllRight, moveLeft, moveAllLeft;
	public TextField input;
	public Button add;
	public ListView leftField, rightField;
	private int selectedIndex;

	private ObservableList<String> rightList;
	private ObservableList<String> leftList;

	public void addAction() {
		String s = input.getText();
		leftList.add(s);
		input.setText("");
		input.requestFocus();
	}

	private boolean move(ListView List, ObservableList<String> before, ObservableList<String> next) {
		selectedIndex = List.getSelectionModel().getSelectedIndex();
		if (selectedIndex < 0)
			new Alert(Alert.AlertType.WARNING, "이동할 항목을 선택하세요", ButtonType.CLOSE).show();

		else {
			Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "정말 이동하시겠습니까?", ButtonType.OK, ButtonType.CANCEL);
			Optional<ButtonType> result = alert.showAndWait();

			if (result.get() == ButtonType.OK)
				return true;
		}
		return false;
	}

	public void moveRightAction() {
		if (move(leftField, leftList, rightList)) {
			String s = leftList.remove(selectedIndex);
			rightList.add(s);
		}
	}

	public void moveAllRightAction() {
		
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "정말 이동하시겠습니까?", ButtonType.OK, ButtonType.CANCEL);
		Optional<ButtonType> result = alert.showAndWait();

		if (result.get() == ButtonType.OK){
			while (!leftList.isEmpty()) {
				String s = leftList.remove(0);
				rightList.add(s);
			}
		}
	}

	public void moveLeftAction() {
		if (move(rightField, rightList, leftList)) {
			String s = rightList.remove(selectedIndex);
			leftList.add(s);
		}
	}

	public void moveAllLeftAction() {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "정말 이동하시겠습니까?", ButtonType.OK, ButtonType.CANCEL);
		Optional<ButtonType> result = alert.showAndWait();

		if (result.get() == ButtonType.OK){
			while (!rightList.isEmpty()) {
				String s = rightList.remove(0);
				leftList.add(s);
			}
		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		rightList = FXCollections.observableArrayList();
		leftList = FXCollections.observableArrayList();
		leftField.setItems(leftList);
		rightField.setItems(rightList);

		input.accessibleTextProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> arg0, String oldValue, String newValue) {
				if (!oldValue.equals(newValue) && newValue.length() > 0)
					add.setDisable(false);

				if (newValue.length() == 0)
					add.setDisable(true);
			}
		});
	}

}
