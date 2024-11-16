package Encapsulation;

public class Student {
	
	private int rollno;
	private String name ;
	 private int clas_no ;
	private char gender ;
	private float percentge;
	
	public void setRoll_no(int rollno) {     
		this.rollno = rollno;
	}
	
	public int getRoll_no() {
		return rollno;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	
	public int getClas_no() {
		return clas_no;
	}

	public void setClas_no(int clas_no) {
		this.clas_no = clas_no;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getPercentge() {
		return percentge;
	}

	public void setPercentge(float percentge) {
		this.percentge = percentge;
	}
	
	

}
