package fileIoOperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamStringExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//files does not take strings directly so that we need to convert all those into bytes by using getbytes(); method
		try {
			FileOutputStream fout=new FileOutputStream("D://testout2.txt");
			String s="WelcomE Pooja";
			//converting string into bytes 
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("success");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
