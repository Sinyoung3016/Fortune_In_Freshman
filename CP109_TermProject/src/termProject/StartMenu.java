package termProject;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import authorization.LogIn;
import authorization.SignUp;

public class StartMenu {//신동훈이 만듦
	Scanner input = new Scanner(System.in);
	private SignUp signMember = new SignUp();
	private LogIn logIn = new LogIn();
	private boolean FisrtOutBool;
	private boolean IdBool;
	private boolean PwBool;
	private int number;
	
	public LogIn getLogIn() {
		return logIn;
	}

	private boolean isYourMember;
	
	
	public boolean getIsYourMember() {
		return isYourMember;
	}

	public boolean startProgram() throws IOException {

		do {
			FisrtOutBool = false;
			while (true) {
				try {
					System.out.println("\n완도산 김과 이천 쌀 그리고 최고급 재료들의 LUXURY & GORGEOUS COLLABORATION");
					System.out.println("	              ★ 유겸신영동훈의 김밥전문점에 오신 것을 환영합니다 ★");
					System.out.println("┌───────────────────────────────────────────────────────┐");
					System.out.println("   〈1〉: 로그인   〈2〉: 비회원 주문   〈3〉: 회원가입   〈4〉: 프로그램 종료");
					System.out.println("└───────────────────────────────────────────────────────┘");
					System.out.println("※ 저희 매장은 TAKE OUT 전문점 입니다.");

					System.out.print("\n[번호를 입력하세요] : ");
					number = input.nextInt();
					input.nextLine();
				} catch (InputMismatchException e) {
					input = new Scanner(System.in);
					System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.\n");
					continue;
				}
				if (number < 1 || number > 4) {
					System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.\n");
					continue;
				}
				break;
			}
			switch (number) {
			case 1:
				do {
					IdBool = false;
					if (logIn .CheckID()) {// 아이디 입력이 성공
						do {
							PwBool = false;
							if (logIn.CheckingPassWord(logIn.getLoadID().getID_PW_Line())) {// 비번 입력도 성공
								System.out.println("\n-------------------------------["+logIn.getID()+"]님 반갑습니다!-------------------------------\n");
								isYourMember=true;
								return true;
							
							} else {// 비번 입력 실패
								while (true) {
									try {
										System.out.println("┌──────────────────────────────────────────────────┐");
										System.out.println("   〈1〉: 아이디 재입력   〈2〉: 비밀번호 재입력   〈3〉: 처음 화면으로");
										System.out.println("└──────────────────────────────────────────────────┘");
										System.out.print("\n[번호를 입력하세요] : ");
										number = input.nextInt();
										input.nextLine();
									} catch (InputMismatchException e) {
										input = new Scanner(System.in);
										System.out.println("※잘못 입력하셨습니다. 다시 입력하세요.\n");
										continue;
									}
									if (number < 1 || number > 3) {
										System.out.println("※잘못 입력하셨습니다. 다시 입력하세요.\n");
										continue;
									}
									break;
								}
								if (number == 1) {
									PwBool = false;// 비밀번호 재입력 빠져나가고
									IdBool = true;// 아이디는 재입력함
								} else if (number == 2) {
									PwBool = true;// 비번 재입력
								} else if (number == 3) {
									PwBool = false;// 비번 재입력 x
									IdBool = false;// 아이디 재입력 x
									FisrtOutBool = true;// 처음화면
								}
							}
						} while (PwBool);
					} else {// 아이디 입력 실패
						while (true) {
							try {
								System.out.println("┌───────────────────────────────┐");
								System.out.println("〈1〉: 아이디 재입력	〈2〉: 처음 화면으로	");
								System.out.println("└───────────────────────────────┘");
								System.out.print("\n[번호를 입력하세요] : ");
								number = input.nextInt();
								input.nextLine();
							} catch (InputMismatchException e) {
								input = new Scanner(System.in);
								System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.\n");
								continue;
							}
							if (number < 1 || number > 2) {
								System.out.println("※ 잘못 입력하셨습니다. 다시 입력하세요.\n");
								continue;
							}
							break;
						}
						if (number == 1) {
							IdBool = true;
						} else if (number == 2) {
							IdBool = false;
							FisrtOutBool = true;
						}
					}

				} while (IdBool);
				break;// case 1: 종료

			case 2:
				isYourMember=false;
				// 비회원주문 메소드 ㄱㄱ
				FisrtOutBool = false;
				return true;

			case 3:
				signMember.SignUp_Program();
				System.out.println("※ 회원가입 완료 ※");
				System.out.println("※ 처음 화면으로 되돌아갑니다.\n");
				FisrtOutBool = true;
				break;

			case 4:
				FisrtOutBool = false;
				
			}
		} while (FisrtOutBool);
		return false;
	}
}
