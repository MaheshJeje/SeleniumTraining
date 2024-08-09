package java;

public class Study09Constructor {
	int value1;
	int value2;
	
	Study09Constructor() {
		value1 = 10;
		value2 = 20;
		System.out.println("Inside the 1st constructor...");
	}

	Study09Constructor(int a){
		value1 = a;
		System.out.println("Inside the 2nd constructor...");
	}
	
	Study09Constructor(int a, int b){
		value1 = a;
		value2 = b;
		System.out.println("Inside the 3rd constructor...");
	}
	
	public void display() {
		System.out.println("Value1 : "+value1);
		System.out.println("Value2 : "+value2);
	}
	
	public static void main(String[] args) {
		Study09Constructor sc1 = new Study09Constructor();
		Study09Constructor sc2 = new Study09Constructor(30);
		Study09Constructor sc3 = new Study09Constructor(40, 50);
		sc1.display();
		sc2.display();
		sc3.display();
	}
}