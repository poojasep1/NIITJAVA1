package anonymous;

public class mainSynchronization {

	public static void main(String[] args) {
		anonymusSynchronization obj =new anonymusSynchronization();
				Thread t1=new Thread()
						{
					public void run(){
						obj.printTable(5);
						
					}
						};
						Thread t2 =new Thread()
								{
							public void run()
							{
								obj.printTable(100);
							}
								};
								t1.start();
								t2.start();
		// TODO Auto-generated method stub

	}

}
