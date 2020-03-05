package lab13_P;

import java.io.*;

public class WriteExample4 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("./src/lab13_P/test.txt");
		char [] data = "ADEFGHI\nJKLMNOP".toCharArray();
		writer.write(data);
		writer.flush();
		writer.close();
	}
}
