package java;

public class Study23FoorLoop {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(a[1]);
		
		System.out.println("For loop");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("For each loop");
		for(int aa : a) {
			System.out.println(aa);
		}
		
		String name[] = {"Mahesh", "Jejurkar", "Pune"};
		
		for( String n  : name) {
			System.out.println(n);
		}
		
	}

}
