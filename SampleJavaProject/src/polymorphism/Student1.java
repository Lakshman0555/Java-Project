package polymorphism;

public class Student1 extends Student{
	
	int stu_age = 12;
	int stu_rollno = 55454;
	String stu_name = "kiran";
	
	@Override
	void display() {
		System.out.println("Student1 child class method block");
		super.display();
	}

	public static void main(String[] args) {
		Student obj = new Student1();     //upcasting
		obj.display();
		obj.display();
		obj.display();
		obj.display();
		
		

	}

}
