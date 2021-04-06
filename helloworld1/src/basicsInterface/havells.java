package basicsInterface;

public class havells implements Iswitchboard {
	public void switchOne()
	{
		System.out.println("havells fan is on");
	}
	

	@Override
	public void switchTwo() {
		// TODO Auto-generated method stub
		System.out.println("havells light is on");
	}
		
	

	@Override
	public void switchThree() {
		// TODO Auto-generated method stub
		System.out.println("havells ac is on");
	}
		
	}


