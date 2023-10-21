package session_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:\\Users\\aksha\\Desktop\book.txt");
		}catch(Exception e) {
			// Handle Exception
		}
		finally {
			fis.close();
		}

	}

}
