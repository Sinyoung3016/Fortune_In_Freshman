package lab09;

import java.net.URL;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lab07.*;

public class Sort_controller implements Initializable {

	@FXML
	public Label randomAnswer, sortAnswer, reSortAnswer;
	@FXML
	public Button sure;
	@FXML
	public TextField constructNumber, min, max;
	@FXML
	public String random, sort, reSort;

	public int [] arr;
	
	public int n = 1, low, high;

	@FXML
	public void registerAction() {
		n = Integer.parseInt(constructNumber.getText());
		low = Integer.parseInt(min.getText());
		high = Integer.parseInt(max.getText());
		arr = Sort.makeRandArr(n, low, high);
		
		randomAnswer.setText(random());
		sortAnswer.setText(sort());
		reSortAnswer.setText(reSort());
	}

	public String random() {
		random = Sort.print(n, arr);
		return random;
	}

	public String sort() {
		Arrays.sort(arr);
		sort = Sort.print(n, arr);
		return sort;
	}

	public String reSort() {
		reverse(arr);
		reSort = Sort.print(n, arr);
		return reSort;
	}
	
	public void reverse(int [] arr) {
		int temp;
	    for (int i = 0; i < arr.length / 2; i++) {
	      temp = arr[i];
	      arr[i] = arr[(arr.length - 1) - i];
	      arr[(arr.length - 1) - i] = temp;
	    }
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
}