package java;

class Dog  {
	
	String breed;
	String size;
	int age;
	String color;
	
	public String getInfo() {
		return ("Breed is : "+ breed
		+"\n Size is : "+ size
		+"\n Age is : "+ age
		+"\n Color is : "+ color);
	}
}


public class Study01 {
	public static void main(String[] args) {
		Dog maltese = new Dog();
		maltese.breed = "Maltese";
		maltese.size = "Small";
		maltese.age = 2;
		maltese.color = "White";
		
		System.out.println(maltese.getInfo());
	}
}