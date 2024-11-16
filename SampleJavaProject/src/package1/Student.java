package package1;

public class Student {
	int rollnumber = 5566;
	String name ="satish";
	int age =5;
	char gender = 'm';
	float percentage =67.6f;
	int marks = 67;

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("student rollnumber is:  "+s.rollnumber);
		System.out.println("student name is:  "+s.name);
		System.out.println("student age is:  "+s.age);
		System.out.println("student gender is: " +s.gender);
		System.out.println("student percentage are:"+ s.percentage);
		System.out.println("student marks are:"+ s.marks);
		
	
	}

}
