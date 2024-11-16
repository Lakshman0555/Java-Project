package Encapsulation;

public class School {
	 

	public static void main(String[] args) {
	Student obj = new Student();
	obj.setRoll_no(777);
	System.out.println(obj.getRoll_no());
	obj.setName("karthik");
	System.out.println(obj.getName());
	obj.setGender('M');
	System.out.println(obj.getGender());
	obj.setPercentge(99f);
	System.out.println(obj.getPercentge());
	obj.setClas_no(9);
	System.out.println(obj.getClas_no());
	Student obj1 = new Student();

	}

}
