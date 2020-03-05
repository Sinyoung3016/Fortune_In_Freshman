package lab04_lab05;

public class ArrayList_Test02 {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		long start1 = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++)
			al.addLast(i);
		long end1 = System.currentTimeMillis();
		System.out.println((end1 - start1)/1000.0 + "초");
		//Array와 Linked 둘 다 비슷한 시간이 소요되었는데
		//이는 size와 tail이 비슷한 역할을 하여 마지막 값을 쉽게 찾을 수 있어
		//마지막에 값을 넣을 수 있지만, Array의 경우에는 array가 다 차있을 경우
		//resize()해야하기 때문에  추가적인 시간이 소요된다. 그래서 둘다 비슷한
		//시간이 소요되지만 Array가 조금 더 많은 시간을 요구한다.
		
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			al.add(i*10, i*100);
		long end2 = System.currentTimeMillis();
		System.out.println((end2 - start2)/1000.0 + "초");
		
		long start3 = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			al.get(10*i);
		long end3 = System.currentTimeMillis();
		System.out.println((end3 - start3)/1000.0 + "초");
		//Linked랑 비교했을때 get메소드는 더 빠르다는 것을 알 수 있다.
		//이는 Linked의 경우에는 get(n)이면 n번만큼 확인하며 값에 찾아가야하지만
		//반대로 Array는 index값으로 값에 찾아가는 것이 빠르기 때문이다.
		
		long start5 = System.currentTimeMillis();
		for (int i = 1000; i > 0; i--)
			al.get(10 * i);
		long end5 = System.currentTimeMillis();
		System.out.println((end5 - start5) / 1000.0 + "초");
		
		long start4 = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++)
			al.remove(i*10);
		long end4 = System.currentTimeMillis();
		System.out.println((end4 - start4)/1000.0 + "초");

	}
}
