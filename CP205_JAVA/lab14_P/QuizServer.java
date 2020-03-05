package lab14_P;

import java.io.*;
import java.net.*;

public class QuizServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(5555);
			System.out.println("��������");
		} catch (IOException e) {
			System.err.println("������ ��Ʈ�� ���� �� �� �����ϴ�.");
			System.exit(1);
		}

		Socket clientSocket = null;
		try {
			clientSocket = serverSocket.accept();
		} catch (IOException e) {
			System.err.println("except() ����");
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
	private String[] answers = { "���", "�ٳ���", "����" };

	public String process(String theInput) {
		String theOutput = null;

		if (state == WAITING) {
			theOutput = "��� �����մϴ�.(y/n)";
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
				theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? (y/n)";
				state = PROBLEM;
			} else {
				state = PROBLEM;
				theOutput = "�����Դϴ�. ����Ͻðڽ��ϱ�? (y/n)";
			}
			currentProblem = (currentProblem + 1) % NUMPROBLEMS;
		}
		return theOutput;
	}
}
