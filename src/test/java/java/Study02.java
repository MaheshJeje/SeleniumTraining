package java;

public class Study02 {
	
	public static void main (String args[]) {
		int a[] = new int[10];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		System.out.println("Lenght of array : "+a.length);
		
		for(int i=0; i<a.length; i++) {
			a[i] = i*i;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		a[12] = 1000;
	}
}