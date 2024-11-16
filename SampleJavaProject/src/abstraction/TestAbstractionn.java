package abstraction;

public class TestAbstractionn extends AbstractEx1 {
	
	void print() {
		System.out.println("This is an abstract method");
	}

	public static void main(String[] args) {
		TestAbstractionn obj = new TestAbstractionn();
		obj.display();
		obj.print();
		System.out.println(obj.company_name);
		

	}

}
