package Serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class InstanceOfDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis;
		
			fis = new FileInputStream("D://testoutdxc.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			ois.close();
			if(o instanceof cat)
			{
				cat c1=(cat)o;
			}
			else if(o instanceof DogObject )
			{
				DogObject d1=(DogObject)o;
				
			}
			else if(o instanceof rat)
			{
				rat r1=(rat)o;
			}
		 
		

	}

}
