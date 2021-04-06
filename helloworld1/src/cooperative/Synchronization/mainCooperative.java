package cooperative.Synchronization;

public class mainCooperative {

	public static void main(String[] args) {
		final customer c= new customer();
		new Thread() {
			public void run()
			{
				c.moneyWithdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				c.deposit(10000);
			}
		}.start();
		// TODO Auto-generated method stub

	}

}
