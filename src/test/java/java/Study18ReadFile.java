package java;
import java.io.*;

public class Study18ReadFile {

	public static void main(String[] args) {
		String fileLine = null;
		FileReader f;
		BufferedReader br = null;
		
		try {
			f = new FileReader("D://Data1.txt");
			br = new BufferedReader(f);
		
			while ((fileLine = br.readLine())!= null) {
			System.out.println(fileLine);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(br != null)
				br.close();
				System.out.println("File Closed...");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}