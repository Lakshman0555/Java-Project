package constructor;

public class Constructor_ex {
	
	int age =55;
	void display() {
		System.out.println("This is sample method");
	}

	public static void main(String[] args) {
		Constructor_ex obj = new  Constructor_ex();
		obj.display();
		System.out.println(obj.age);
		
		

	}

}
