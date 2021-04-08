package lamdaexpressions;

public class MyRunnable  extends Thread{
	public void run()
	{
		for (int i=0;i<5;i++) {
		System.out.println("these is my thread");
		}
	}
	//lamda expression for above method
	//()->
	//{
		//for (int i=0;i<5;i++) {
		//System.out.println("these is my thread");
		//}
	//}

}
