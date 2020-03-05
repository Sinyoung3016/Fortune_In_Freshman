package project02;

import java.util.Scanner;

class C {
	int left, right;
	
	public C(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(left + right);
	}
}

public class practice {
public static void main(String[] args) {
	
	C input = new C(10,20);
	input.sum();
	
	
	}
}