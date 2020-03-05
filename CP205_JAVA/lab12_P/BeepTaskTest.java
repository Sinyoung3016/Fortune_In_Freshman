package lab12_P;

import java.awt.Toolkit;

public class BeepTaskTest {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}
		});
		thread.start();
		for(int i = 0; i <5; i++) {
			System.out.println("¶ò");
			try {Thread.sleep(1000);}
			catch(Exception e) {				
			}
		}
	}
}
