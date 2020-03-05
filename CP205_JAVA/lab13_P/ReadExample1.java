package lab13_P;

import java.io.*;

public class ReadExample1 {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("./src/lab13/test.txt");
		int readByte;
		while(true) {
			readByte = is.read();
			if(readByte == -1) break;
			System.out.println((char)readByte);
		}
		is.close();
	}
}
