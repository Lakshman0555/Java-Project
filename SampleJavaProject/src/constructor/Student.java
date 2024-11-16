package constructor;

public class Student {
	String name;
	int age;
	float percentage;
	int rollno;
	char gender ;
	
	public Student(String name1,int age1,float percentage1,int rollno1,char gender1)
	{
		name = name1;
		age = age1;
		percentage = percentage1;
		rollno  = rollno1;
		gender = gender1;
	}
	void display() {
		System.out.println(name+" "+age+" "+percentage+" "+rollno+"  "+gender);
	}
	
	public static void main(String[] args) {
		Student obj = new Student("sai",12,90f,555,'M');
		System.out.println("student1 details:");
		obj.display();
		System.out.println("-----------------------------------");
		Student obj1 = new Student("sai lakshman",13,99f,556,'M');
		System.out.println("student2 details:");
		obj1.display();
		System.out.println("-----------------------------------");
		Student obj2 = new Student("sirisha",13,99f,556,'F');
		System.out.println("student3 details:");
		obj2.display();
		

	}

}
