package lab06_P;
import java.util.*;
import java.io.*;
public class Search {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;  i <5; i++)
			list.add(i);
		
		System.out.println(sequentialSearch(list, 3, 0, 4));

	}

/*	public static <T> int sequentialSearch(ArrayList <T> list, T target) {
	for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(target))
				return i;
		}
		return -1;
}*/

	public static <T> int sequentialSearch(ArrayList <T> list, T target, int begin, int end) {
		if(end < 0)
			return -1;
		else if(list.get(end).equals(target))
			return end;
		else
			return sequentialSearch(list, target, begin, end-1);
	}
	// 타겟이랑 0이 같은지 확인, 맞으면 return 틀리면 다시
}
