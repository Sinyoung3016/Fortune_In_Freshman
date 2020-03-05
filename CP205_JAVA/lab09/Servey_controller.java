package lab09;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class Servey_controller implements Initializable{
	
	@FXML
	public TextField nameField;
	@FXML
	public RadioButton man, woman;
	@FXML
	public ChoiceBox <String> livingField;
	@FXML
	public CheckBox mon, tues, wed, thurs, fri, sat, sun;
	@FXML
	public RadioButton lotte, ever, ski, maru, jiran, home;
	@FXML
	public Button Sure;
	@FXML
	public Label print;
	@FXML
	public void registerAction() {
		StringBuilder sb = new StringBuilder();
		String name = nameField.getText();
		sb.append("이름  :  " + name + "\n\n");
		
		if(man.isSelected())
			sb.append("성별  :  남성\n\n");
		else if(woman.isSelected())
			sb.append("성별  :  여성\n\n");
		
		String where = livingField.getValue();
		sb.append("사는 장소  :  " + where + "\n\n");
		
		sb.append("가능한 요일  :  ");
		if(mon.isSelected())
			sb.append("월요일  ");
		if(tues.isSelected())
			sb.append("화요일  ");
		if(wed.isSelected())
			sb.append("수요일  ");
		if(thurs.isSelected())
			sb.append("목요일  ");
		if(fri.isSelected())
			sb.append("금요일  ");
		if(sat.isSelected())
			sb.append("토요일  ");
		if(sun.isSelected())
			sb.append("일요일  ");
		sb.append("\n\n");
		
		sb.append("가고 싶은 곳  :  ");
		if(lotte.isSelected())
			sb.append("서울구경 겸, 롯데월드");
		else if(ever.isSelected())
			sb.append("환상의 나라, 에버랜드");
		else if(ski.isSelected())
			sb.append("스키장과 재용이의 양산집");
		else if(maru.isSelected())
			sb.append("마루보러 정현이네 집");
		else if(jiran.isSelected())
			sb.append("우리 마음의 안식처, 지란지교");
		else if(home.isSelected())
			sb.append("각자 집에서 쉬기^^");
		
		print.setText(sb.toString());
	}
	
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ObservableList <String> comboList
			= FXCollections.observableArrayList("대전", "천안", "광주", "부산", "대구");
		livingField.setItems(comboList);
		
		ToggleGroup sex = new ToggleGroup();
		man.setToggleGroup(sex);
		woman.setToggleGroup(sex);
		
		ToggleGroup place = new ToggleGroup();
		lotte.setToggleGroup(place);
		ever.setToggleGroup(place);
		ski.setToggleGroup(place);
		maru.setToggleGroup(place);
		jiran.setToggleGroup(place);
		home.setToggleGroup(place);
		
	}


}
