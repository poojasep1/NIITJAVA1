package collections;

import java.io.*;

public class Test {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("db.properties");
		properties p =new properties();
		p.load(reader);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));

	}

}
