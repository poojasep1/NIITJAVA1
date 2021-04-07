package Serialiazation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TransientMainMethod {

	public static void main(String[] args) {
		Transient d1=new Transient() ;
		try {
			FileOutputStream fos =new FileOutputStream("D://testoutDxc");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(d1);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//De-serialaization
		try {
			
		
		FileInputStream fis;
		fis=new FileInputStream("D://testoutDxc");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Transient d2=(Transient)ois.readObject();
		System.out.println(d2.i+"\t"+d2.j);
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}
		
		


	}

}
