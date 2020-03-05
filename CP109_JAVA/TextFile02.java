package project02;

import java.io.*;
import java.util.*;

public class TextFile02 {
	
	static final int Max_num_of_data = 50;
	static final int Max_value_of_data = 100;
	
	public static void main(String[] args) {
		int num_of_data = 0;
		ArrayList<Integer> data_list = new ArrayList<Integer>();
		int sum = 0, average = 0;

		try {
			Scanner input = new Scanner(new File("data2.txt"));
			while (input.hasNext()) {
				data_list.add(input.nextInt());
			}
			num_of_data = data_list.size();
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("*** 입력 파일이 존재하지 않습니다.");
		} catch (Exception e) {
			System.out.println("*** 기타 오류가 발생했습니다.");
		}

		if (num_of_data == 0) {
			System.out.println("*** 데이터를 직접 작성합니다.");
			num_of_data = (int) (Math.random() * Max_num_of_data);
			data_list = new ArrayList<>(num_of_data);
			int i = 0;
			while (num_of_data > i) {
				data_list.add((int) (Math.random() * Max_value_of_data));
				i++;
			}

			try {
				PrintStream out = new PrintStream(new FileOutputStream("data1.txt"));
				out.println(num_of_data);
				for (int n : data_list)
					out.println(n);
				out.close();
				System.out.println("*** 생성된 데이터를 성공적으로 저장했습니다.");
			} catch (IOException e) {
				System.out.println("*** 입출력 오류가 있습니다.");
			}
		}
		
		System.out.println("텍스트 파일로부터 입력받거나 생성한 정수  (" + data_list.size() + "개 ) : ");
		for(int n : data_list) {
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();
		average = sum/num_of_data;
		System.out.println("정수들의 평균 = " + average);
		
		System.out.println("*** 정수들을 정렬합니다.");
		Collections.sort(data_list);
		
		System.out.println("정렬된 정수들 (" + data_list.size() + "개) : ");
		for(int n : data_list)
			System.out.print(n + " ");
		System.out.println();
		
		try {
			PrintStream out = new PrintStream(new FileOutputStream("sorted_data1.txt"));
			out.println(num_of_data);
			for(int n : data_list)
				out.println(n);
			out.close();
			System.out.println("*** 정렬된 데이터를 성공적으로 저장했습니다.");
		}catch(IOException e) {
			System.out.println("*** 입출력 오류가 있습니다.");
		}

	}
}
