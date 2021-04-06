package cooperative.Synchronization;

public class customer {
	int amount=10000;
	synchronized void moneyWithdraw(int amount) {
		System.out.println("going to withdraw money");
		if(this.amount<=amount)
		{
			System.out.println("amount is less so, wait for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.amount-=amount;
			System.out.println("withdraw completed");
		}
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("deposit completed");
		notify();
	}

}
