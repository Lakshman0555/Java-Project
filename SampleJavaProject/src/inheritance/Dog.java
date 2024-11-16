package inheritance;

public class Dog extends Animal {
	String name = "dog";
	
	@Override
	void sound() {
		System.out.println("dog is barking");
		System.out.println(super.name);
		super.sound();
	}
	@Override
	void display() {
		System.out.println("child class method");
		super.display();
		
	}
	
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.sound();
	  obj.display();
	  System.out.println(obj.name);
		
	
	
	}
}
