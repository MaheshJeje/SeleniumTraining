package java;

public class Study07ThisKeyword {
	int a;
	int b;

	
	public void setData(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void showData() {
		System.out.println("Value of A : "+a);
		System.out.println("Value of B: "+b);
	}
	
	public static void main(String[] args) {
		Study07ThisKeyword obj = new Study07ThisKeyword();
		obj.setData(2, 3);
		obj.showData();
	}
}