package lab13_P;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("./src/lab13_P/test.txt");
		int readByteNo;
		byte [] readBytes = new byte [3];
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) break;
			data += new String(readBytes, 0, readByteNo);
			System.out.println((char)readByteNo);
		}
		System.out.println(data);
		is.close();
	}
}