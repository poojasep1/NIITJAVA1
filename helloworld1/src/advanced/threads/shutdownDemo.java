package advanced.threads;

public class shutdownDemo {
	public static void main(String args[])
	{
		Runtime runtime=Runtime.getRuntime();
		runtime.addShutdownHook(new shutDown());
		System.out.println("now main sleepin........ press ctrl+c to exit");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
  class shutDown extends Thread{
	  public void run()
	  {
		  System.out.println("watchman is shutting down all electric appliances");
	  }
}