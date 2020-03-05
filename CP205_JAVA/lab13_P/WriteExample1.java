package lab13_P;

import java.io.*;

public class WriteExample1 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("./src/lab13_P/test.txt");
		byte [] data = "ABCDEFGHI\nJKLMNOP".getBytes();
		for(int i = 0; i < data.length; i++)
			os.write(data[i]);
		os.flush();
		os.close();
	}
}
