package lab14_P;

import java.net.*;
import java.io.*;

public class Sender {
	public static void main(String[] args) throws IOException{
		DatagramSocket socket = new DatagramSocket();
		String s = "¾È³ç";
		byte [] buf = s.getBytes();
		
		InetAddress address = InetAddress.getByName("192.168.0.177");
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 5000);
		socket.send(packet);
		socket.close();
	}
}
