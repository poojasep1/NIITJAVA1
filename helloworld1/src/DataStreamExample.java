import java.io.FileInputStream;


public class DataStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("C:\\pooja11");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
