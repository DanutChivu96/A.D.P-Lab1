package thread;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.LinkedList;

public class Main {
	public static int listSize = 5;
	public static LinkedList<Integer> list = new LinkedList<Integer>(); 
	public static Semaphore s = new Semaphore(1);
	
	public static void main(String[] args) {

	 Producator producator = new Producator();
	 producator.run();
	 Consumator consumator = new Consumator();
	 consumator.run();
	 
	 System.out.println("Incepe simularea...");
	 System.out.println(" ");


	 
	 try {
		producator.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		consumator.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 

	}

}