package thread;

public class Consumator extends Thread {
	
	private Producator producator;
	@Override
	public void run() {
		try {
			while(true) {
				Main.s.acquire();
				if(Main.list.isEmpty() == true) {
					System.out.println("Lista este goala");
				}
				else {
					System.out.println("Se consuma elementul...");
					
					Main.list.remove();
					System.out.println("A fost consumat elementul" + Main.list.getLast());
					
				}
				Main.s.release();
				Thread.sleep(100);
			}
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
