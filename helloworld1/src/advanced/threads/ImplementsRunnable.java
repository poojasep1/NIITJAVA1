package advanced.threads;

public class ImplementsRunnable implements Runnable {
	public void run() {
		System.out.println("welcome threads");
	}
	public void run1() {
		System.out.println("Threads are started executing");
	}
	public static void main(String args[]) {
		ImplementsRunnable ir=new ImplementsRunnable();
		Thread t1=new Thread(ir);
		t1.start();
	}

}
