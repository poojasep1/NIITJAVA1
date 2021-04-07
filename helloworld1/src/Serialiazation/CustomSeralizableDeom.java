package Serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CustomSeralizableDeom {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account account =new Account();
		//serialization
		FileOutputStream fos=new FileOutputStream("account.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(account);
		// TODO Auto-generated method stub
		//Deserialization
		FileInputStream fis =new FileInputStream("account.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Account account2=(Account)ois.readObject();
		System.out.println("username="+ account2.userName+"password="+account2.password);
	
		

	}

}
