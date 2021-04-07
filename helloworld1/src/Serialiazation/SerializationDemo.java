package Serialiazation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Serialization
		DogObject d1=new DogObject();
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
		DogObject d2=(DogObject)ois.readObject();
		System.out.println(d2.i+"\t"+d2.j);
		}
		catch(Exception e)
		
		{
			System.out.println(e);
		}
		
		


	}

}
