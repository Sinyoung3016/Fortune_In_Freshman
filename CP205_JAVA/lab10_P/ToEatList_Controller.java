package lab10_P;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Predicate;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ToEatList_Controller implements Initializable {

	@FXML
	public TextField searchField;
	@FXML
	public Button search;
	@FXML
	public TextField foodname;
	@FXML
	public Button foodNameAdd;
	@FXML
	public Button foodNameDelete;
	@FXML
	public ListView<String> printField;

	private ObservableList<String> foodList; // 음식 목록
	private FilteredList<String> filterList; // 검색 결과를 담는 객체

	@FXML
	public void searchAction() {
		filterList.setPredicate(new Predicate<String>(){
			@Override
			public boolean test (String t) {
				if(t.contains(searchField.getText()))
					return true;
				return false;
			}
		});
		printField.setItems(filterList);
	}

	@FXML
	public void addAction() {
		String food = foodname.getText();
		foodList.add(food);
		foodname.setText("");
		foodname.requestFocus();
	}

	@FXML
	public void deleteAction() {
		int selectedIndex = printField.getSelectionModel().getSelectedIndex();
		
		if(selectedIndex < 0) {
			new Alert(Alert.AlertType.WARNING,"삭제할 항목을 선택하세요", ButtonType.CLOSE).show();
			return;
		}
		
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"정말 삭제하시겠습니까?", ButtonType.OK, ButtonType.CANCEL);
		Optional <ButtonType> result = alert.showAndWait();
		
		if(result.get() == ButtonType.OK)
			foodList.remove(selectedIndex);
		
	}

	public void initialize(URL arg0, ResourceBundle arg1) {
		foodList = FXCollections.observableArrayList();
		printField.setItems(foodList);

		filterList = new FilteredList<String>(foodList);
		foodname.accessibleTextProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> arg0, String oldValue, String newValue) {
				if(!oldValue.equals(newValue)&& newValue.length() > 0)
					foodNameAdd.setDisable(false);
				
				if(newValue.length() == 0)
					foodNameAdd.setDisable(true);
			}
		});

	}

}
