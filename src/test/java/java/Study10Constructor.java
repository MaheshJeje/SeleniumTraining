package java;

public class Study10Constructor {
	int value1;
	int value2;
	
	Study10Constructor(){
		value1 = 1;
		value2 = 2;
		System.out.println("Inside the 1st constructor of parent...");
	}
	
	Study10Constructor(int a){
		value1 = a;
		System.out.println("Inside the 2nd constructor of child...");
	}
	
	public void display() {
		System.out.println("Value1 : "+value1);
		System.out.println("Value2 : "+value2);
	}

	public static void main(String[] args) {
		DemoChild d1 = new DemoChild();
		d1.display();
	}
}
class DemoChild extends Study10Constructor{
	int value3;
	int value4;
	
	DemoChild(){
		super(5);
		value3 = 3;
		value4 = 4;
		System.out.println("Inside the constructor of child...");
	}
	
	public void display() {
		System.out.println("Value1 : "+value1);
		System.out.println("Value2 : "+value2);
		System.out.println("Value3 : "+value3);
		System.out.println("Value4 : "+value4);
	}
}

