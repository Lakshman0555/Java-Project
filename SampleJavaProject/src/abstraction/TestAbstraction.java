package abstraction;

public class TestAbstraction extends AbstractEx{
	
	void sample() {
		System.out.println("abstract method implementation");
	}

	public static void main(String[] args) {
		
		TestAbstraction obj = new TestAbstraction();
		obj.sample();
		obj.display();
		System.out.println(obj.experience);
		System.out.println(obj.institute);
	}

}
