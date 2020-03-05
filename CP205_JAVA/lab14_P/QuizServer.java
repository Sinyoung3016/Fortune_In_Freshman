package lab14_P;

import java.io.*;
import java.net.*;

public class QuizServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5555);
			System.out.println("서버연결");
		} catch (IOException e) {
			System.err.println("다음의 포트와 연결 할 수 없습니다.");
			System.exit(1);
		}

		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("except() 실패");
			System.exit(1);
		}

		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
		BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

		String inputLine, outputLine;
		QuizProtocol qp = new QuizProtocol();
		outputLine = qp.process(null);
		out.println(outputLine);

		while ((inputLine = in.readLine()) != null) {
			outputLine = qp.process(inputLine);
			out.println(outputLine);
			if (outputLine.equals("quit"))
				break;
		}

		out.close();
		in.close();
		clientSocket.close();
		serverSocket.close();
	}
}

class QuizProtocol {
	private static final int WAITING = 0;
	private static final int PROBLEM = 1;
	private static final int ANSWER = 2;
	private static final int NUMPROBLEMS = 3;
	private int state = WAITING;
	private int currentProblem = 0;

	private String[] problems = { "Apple in Korean?", "Banana in Korean?", "Butterfly in Korean?" };
	private String[] answers = { "사과", "바나나", "나비" };

	public String process(String theInput) {
		String theOutput = null;

		if (state == WAITING) {
			theOutput = "퀴즈를 시작합니다.(y/n)";
			state = PROBLEM;
		} else if (state == PROBLEM) {
			if (theInput.equalsIgnoreCase("y")) {
				theOutput = problems[currentProblem];
				state = ANSWER;
			} else {
				state = WAITING;
				theOutput = "quit";
			}
		} else if (state == ANSWER) {
			if (theInput.equalsIgnoreCase(answers[currentProblem])) {
				theOutput = "정답입니다. 계속하시겠습니까? (y/n)";
				state = PROBLEM;
			} else {
				state = PROBLEM;
				theOutput = "오답입니다. 계속하시겠습니까? (y/n)";
			}
			currentProblem = (currentProblem + 1) % NUMPROBLEMS;
		}
		return theOutput;
	}
}
