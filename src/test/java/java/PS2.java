package java;

import org.testng.annotations.Test;

public class PS2 extends PS4{
	
	int a;
	public PS2(int a) {
		super(a);		//Parent class constructor is invoked. 
		this.a=a;
	}

	@Test
	public int increment() {
		a=a+3;
		return a;
	}
	
	@Test
	public int decrement() {
		a=a-3;
		return a;
	}
}
