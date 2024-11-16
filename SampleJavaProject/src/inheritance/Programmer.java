package inheritance;

public class Programmer extends Employee{
	
	String area = "banglore";
	int units = 90;
	
	void print() {
		System.out.println(super.area +"  parent class variable");
		System.out.println(super.units + "   parent class variable");
		System.out.println("child class method");
		super.print();
	}
	public Programmer() {
		super();
		System.out.println("this is child class constructor");
	}
	

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		obj.print();
		System.out.println(obj.area);
		System.out.println(obj.units);
		

	}

}
