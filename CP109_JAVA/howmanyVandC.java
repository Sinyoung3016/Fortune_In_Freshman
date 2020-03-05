package project02;
import java.util.Scanner;

class Howmany{
	int Volew = 0;
	int Consonant = 0;
	
	void HowmanyCount(String A){
		A=A.toLowerCase();
		
		char [] Con = {'b','c','d','f','g','h','j','k','l',
				'm','n','p','q','r','s','t','v','w','x','y','z'};
		
		char [] Vol = {'a','e','i','o','u',};
		
		for(int i= 0; i< A.length(); i++ ) {
			for(int a = 0; a < 21; a++) {
				if(A.charAt(i) != Con[a])
					continue;
				Consonant ++;
				}
			}
		for(int i= 0; i< A.length(); i++ ) {
			for(int a = 0; a < 5; a++) {
				if(A.charAt(i) == Vol[a])
				Volew ++;
				}
			}
		System.out.println("모음의 개수 : " + Volew);
		System.out.println("자음의 개수 : " + Consonant);	
	}	
}

