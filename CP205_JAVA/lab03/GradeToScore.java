package lab03;

import java.util.*;

public class GradeToScore {
	Map<Character, Double> map = new HashMap<>();

	public GradeToScore() {
		this.map.put('A', 4.0);
		this.map.put('B', 3.0);
		this.map.put('C', 2.0);
		this.map.put('D', 1.0);
		this.map.put('E', 0.0);
	}

}
