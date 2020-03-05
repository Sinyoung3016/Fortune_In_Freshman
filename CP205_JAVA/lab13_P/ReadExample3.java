package lab13_P;

import java.io.*;

public class ReadExample3 {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("./src/lab13_P/test.txt");
		int readData;
		while(true) {
			readData = reader.read();
			if(readData == -1) break;
			System.out.print((char)readData);
		}
		reader.close();
	}
}
