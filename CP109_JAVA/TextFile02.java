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
			System.out.println("*** �Է� ������ �������� �ʽ��ϴ�.");
		} catch (Exception e) {
			System.out.println("*** ��Ÿ ������ �߻��߽��ϴ�.");
		}

		if (num_of_data == 0) {
			System.out.println("*** �����͸� ���� �ۼ��մϴ�.");
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
				System.out.println("*** ������ �����͸� ���������� �����߽��ϴ�.");
			} catch (IOException e) {
				System.out.println("*** ����� ������ �ֽ��ϴ�.");
			}
		}
		
		System.out.println("�ؽ�Ʈ ���Ϸκ��� �Է¹ްų� ������ ����  (" + data_list.size() + "�� ) : ");
		for(int n : data_list) {
			System.out.print(n + " ");
			sum += n;
		}
		System.out.println();
		average = sum/num_of_data;
		System.out.println("�������� ��� = " + average);
		
		System.out.println("*** �������� �����մϴ�.");
		Collections.sort(data_list);
		
		System.out.println("���ĵ� ������ (" + data_list.size() + "��) : ");
		for(int n : data_list)
			System.out.print(n + " ");
		System.out.println();
		
		try {
			PrintStream out = new PrintStream(new FileOutputStream("sorted_data1.txt"));
			out.println(num_of_data);
			for(int n : data_list)
				out.println(n);
			out.close();
			System.out.println("*** ���ĵ� �����͸� ���������� �����߽��ϴ�.");
		}catch(IOException e) {
			System.out.println("*** ����� ������ �ֽ��ϴ�.");
		}

	}
}
