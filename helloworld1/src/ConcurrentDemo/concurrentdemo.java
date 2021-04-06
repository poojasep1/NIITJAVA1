package ConcurrentDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class concurrentdemo extends Thread{
	static Vector<String> arraylist=new Vector<String>();
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		arraylist.add("some");
	}
	
	
public static void main(String args[]) throws InterruptedException{
	arraylist.add("A");
	arraylist.add("ccd");
	arraylist.add("ba");
	arraylist.add("CA");
	concurrentdemo concurrentDemo=new concurrentdemo();
	concurrentDemo.start();
	Iterator<String> iterator =arraylist.iterator();
	while(iterator.hasNext()) {
		String s=iterator.next();
		System.out.println(s);
		Thread.sleep(6000);
	}
	System.out.println(arraylist);
	
	
}
}
