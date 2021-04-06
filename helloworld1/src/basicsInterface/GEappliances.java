package basicsInterface;

public class GEappliances implements Iswitchboard {
	public void switchOne()
	{
		System.out.println("GE fan is on");
	}

	@Override
	public void switchTwo() {
		// TODO Auto-generated method stub
		System.out.println("ge light is on");
		
	}

	@Override
	public void switchThree() {
		// TODO Auto-generated method stub
		System.out.println("ge ac is on");
		
	}
	
	

}
