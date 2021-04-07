package Serialiazation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectGroupDemo {

	public static void main(String[] args) throws Exception {
		DogObject d1=new DogObject();
		FileOutputStream fos =new FileOutputStream("D://testoutdxc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		// TODO Auto-generated method stub

	}

}
