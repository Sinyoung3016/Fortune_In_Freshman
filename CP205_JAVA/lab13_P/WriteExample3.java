package lab13_P;

import java.io.*;

public class WriteExample3 {
	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("./src/lab13_P/test.txt");
		byte [] data = "ABCDEFGHI\nJKLMNOP".getBytes();
		for(int i = 0; i < data.length; i++)
			writer.write(data[i]);
		writer.flush();
		writer.close();
	}
}