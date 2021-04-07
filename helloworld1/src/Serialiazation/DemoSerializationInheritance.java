package Serialiazation;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
public class DemoSerializationInheritance {

	public static void main(String[] args) throws Exception{
	final String fileName="inheritance.txt";
		// TODO Auto-generated method stub
		Rabbit rabbit=new Rabbit();
		rabbit.i=999;
		rabbit.j=888;
		rabbit.k=777;
		FileOutputStream fos= new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(rabbit);
		
		FileInputStream fis =new FileInputStream(fileName);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Rabbit rabbit2=(Rabbit)ois.readObject();
System.out.println("rabbits variables i="+rabbit2.i+"j="+rabbit2.j+"k="+rabbit2.k);
	}

}
