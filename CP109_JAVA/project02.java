package project;
import java.util.Scanner;
public class project02 {
 public static void main(String[] args) {
 
	 boolean city;
	 int people;
	 int rich;
	 String cap;
	 
	 @SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	 System.out.print("수도입니까?(수도:1, 수도아님:0) : ");
	 city = (input.nextInt() == 1)?  true : false; 
	 System.out.print("총 인구는?(단위:만) :");
	 people = input.nextInt();
	 System.out.print("연소득이 1억 이상인 인구는?(단위:만) :");
	 rich = input.nextInt();
	 
	 cap = (city && (people >= 100)) || (city && (rich >= 50))? "맞습니다.": "아닙니다.";
	 System.out.println("이 도시는 메트로폴리스가 " + cap);
	
}
}
