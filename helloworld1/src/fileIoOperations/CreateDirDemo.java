package fileIoOperations;

import java.io.File;

public class CreateDirDemo {

	public static void main(String[] args) {
		File file=new File("c:\\");
		String[] directories;
		directories =file.list();
		for(String path:directories) {
			System.out.println(path);
		}
		// TODO Auto-generated method stub

	}

}
