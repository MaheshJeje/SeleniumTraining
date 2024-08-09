package java;

public class Study17Split {

	public static void main(String[] args) {
		Study17Split obj1 = new Study17Split();
		obj1.f1_split();
		obj1.f2_split();
		obj1.f3_split();
	}
	
	public void f1_split() {
		System.out.println("In function f1_split - ");
		String str = "Alpha, Belta, Gamma, Delta, Sigma";
		String a[]= str.split(", ");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public void f2_split() {
		System.out.println("In function f2_split - ");
		String str = "Alpha, Belta, Gamma, Delta, Sigma";
		String a[]= str.split(", ", 4);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public void f3_split() {
		System.out.println("In function f3_split - ");
		String str = "Alpha, Belta, Gamma, Delta, Sigma";
		String a[]= str.split(" ");
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}