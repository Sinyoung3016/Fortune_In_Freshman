package lab13;

import java.io.*;

public class Ceaser {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("./src/lab13/test.txt");
		int readData;
		while (true) {
			readData = reader.read();
			if (readData == -1) break;
			
			if (97 <= readData && readData <= 122)
				readData -= 32;
			
			if( 65 <= readData && readData <= 87)
				System.out.print((char)(readData + 3));
			else if (88 <= readData && readData <= 90)
				System.out.print((char)(readData - 22));
			else
				System.out.print((char)(readData));
		}
		reader.close();
	}
}
