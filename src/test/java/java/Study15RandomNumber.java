package java;

import java.util.Random;

public class Study15RandomNumber {

	public static void main(String[] args) {
		Random ranNo = new Random();
		
		for(int i=0; i<10; i++) {
			int no = ranNo.nextInt(10,20);
			System.out.println(no);
		}
	}
}