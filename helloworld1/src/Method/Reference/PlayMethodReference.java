package Method.Reference;

public class PlayMethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1=PlayMethodReference ::m1;
		Thread t1=new Thread(r1);
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("these is child thread");
		}
	}
		
		public static void m1() {
			for(int i=0;i<10;i++) {
				System.out.println("these is main thread");
			}
		

	}

}
