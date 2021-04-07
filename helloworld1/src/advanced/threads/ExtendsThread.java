package advanced.threads;

public class ExtendsThread extends Thread{
	public void run() {
		System.out.println("hello pooja");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread et=new ExtendsThread();
		et.start();
		
		

	}

}
