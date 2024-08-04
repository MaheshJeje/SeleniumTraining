package datadriventesting;

import java.util.ArrayList;

public class Test1 {
	public static void main(String[] args) throws Exception {
		DataDrivenTest d = new DataDrivenTest();
		ArrayList<String> data	= d.getData("Add Profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}
}
