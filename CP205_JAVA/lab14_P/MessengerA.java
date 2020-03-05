package lab14_P;

import java.net.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;

public class MessengerA {

	protected JTextField tf;
	protected JTextArea ta;
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;
	final int myPort = 5000;
	final int otherPort = 6000;

	public MessengerA() throws IOException {
		MyFrame f = new MyFrame();
		address = InetAddress.getByName("192.168.0.177");
		socket = new DatagramSocket(myPort);
	}

	public void process() {
		while (true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				ta.append("RECIEVED : " + new String(buf) + "\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class MyFrame extends JFrame implements ActionListener {
		public MyFrame() {
			super("MessengerA");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			tf = new JTextField(30);
			tf.addActionListener(this);

			ta = new JTextArea(10, 30);
			ta.setEditable(false);

			add(tf, BorderLayout.PAGE_END);
			add(ta, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent evt) {
			String s =tf.getText();
			byte [] buffer = s.getBytes();
			DatagramPacket packet;
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
				socket.send(packet);
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			ta.append("SENT :" + s + "\n");
			tf.selectAll();
			ta.setCaretPosition(ta.getDocument().getLength());
		}
	}
	
	public static void main(String[] args) throws IOException{
		MessengerA m = new MessengerA();
		m.process();
	}
}