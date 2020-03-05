package lab13_P;

import java.io.*;

public class WriteExample2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("./src/lab13_P/test.txt");
		byte [] data = "ADEFGHI\nJKLMNOP".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}
}