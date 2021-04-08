package lamdaexpressions.anaonymus;

public class AnonymusclassvthLamda {

	public static void main(String[] args) {
		Person employee=new Person(){
		 void eat() {
			System.out.println("anonymus employee eating");
			
		}
	};
	employee.eat();

	
	Thread t=new Thread() {
		public void run() {
			System.out.println("child thread");
		}
	};
	t.start();
	
	Runnable r=new Runnable() {
		public void run()
		{
			System.out.println("i am in runnable");
		}
	};
	Thread t1=new Thread(r);
	t1.start();
	}
}
