package thread;

import java.util.Random;

public class Producator extends Thread {
	
	public int randomElement;

	@Override 
	public void run() {
		try {
			while(true) {
				randomElement = new Random().nextInt(10);
				Main.s.acquire();
				if(Main.list.size() == Main.listSize) {
					System.out.println("Lista este plina");
				}
				else {
					
					System.out.println("Se produce elementul..");
					Main.list.add(randomElement);
					
					System.out.println("A fost produs elememntul" + randomElement);	
				}
				Main.s.release();
				Thread.sleep(150);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}