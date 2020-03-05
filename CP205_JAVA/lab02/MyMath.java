package lab02;

public class MyMath<T extends Number> {

	public double getAverage(T[] input) {
		double answer = 0;
		int T_Leng = input.length;

		for (int i = 0; i < T_Leng; i++) {
			answer += input[i].doubleValue();
		}

		answer /= T_Leng;
		return answer;
	}
}
