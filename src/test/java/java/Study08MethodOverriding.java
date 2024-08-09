package java;

class Doctor{
	public void treatPatient() {
		System.out.println("Doctor Method...");
	}
}

class Surgeon extends Doctor{
	public void treatPatient() {
		System.out.println("Surgeon Method...");
	}
}

public class Study08MethodOverriding {
	public static void main(String[] args) {
		Doctor objDoc = new  Surgeon();
		objDoc.treatPatient();
		
		Surgeon objSrgn = new Surgeon();
		objSrgn.treatPatient();
	}
}