package inheritance;

public class Cat extends Animal {
	String name4 = "Cat";
	void sound4() {
		System.out.println("cat is meowing");
	}

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.sound4();
		obj.sound();
		System.out.println(obj.name);
		System.out.println(obj.name4);
	

	}

}
