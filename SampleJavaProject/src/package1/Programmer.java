package package1;

public class Programmer {
	String programmer_name = "shiva";
	int programmer_id = 23654;
	float programmer_salary = 10000.05f;    //instance variable
	static String company_name = "Arcus";    //static variable
	
	void display() {
		int result = 44455;          //local variable
		System.out.println("This is local variable:   "+result);
		System.out.println("This is sample java program");
	}
	


	public static void main(String[] args) {
		String programer_position = "manager";         ///global variable
		System.out.println(programer_position);
		Programmer obj  = new Programmer();
		System.out.println("This is instance variable:   "+obj.programmer_name);
		System.out.println("This is instance variable:   "+obj.programmer_id);
		System.out.println("This is instance variable:   "+obj.programmer_salary);
		System.out.println("This is static variable: "+company_name);
		obj.display();
	}

}
