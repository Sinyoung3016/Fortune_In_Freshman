package lab13_P;

import java.io.*;

public class ReadExample4 {
	public static void main(String[] args) throws IOException {
		Reader reader = new FileReader("./src/lab13_P/test.txt");
		int readCharNo;
		char [] cbuf = new char [2];
		String data = "";
		while(true) {
			readCharNo = reader.read(cbuf);
			if(readCharNo == -1) break;
			data += new String(cbuf);
			System.out.println((char)readCharNo);
		}
		System.out.println(data);
		reader.close();
	}
}