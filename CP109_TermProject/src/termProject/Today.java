package termProject;

import java.time.LocalDate;
import java.time.LocalTime;

public class Today {//Ω≈µø»∆¿Ã ∏∏µÍ
	
	public LocalTime getPresentTime() {
		LocalTime presentTime=LocalTime.now();
		presentTime=presentTime.withNano(0);//≥™≥Î√ ∏¶ ¡¶∞≈«ÿ¡‹
		return presentTime;
	}
	public LocalDate getTodayDate() {
		LocalDate todayDate =LocalDate.now();
		return todayDate;
	}

}
