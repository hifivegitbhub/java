package ss.d1107;

import java.awt.Toolkit;

public class BeepPrintTest {
	public static void main(String[] args) {
		// BeepTask bt = new BeepTask();
		//
		// Thread t = new Thread(bt);
		// t.start();

		Thread tt = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit t = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					t.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

		tt.start();

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("¶ò");
		}
	}
}
