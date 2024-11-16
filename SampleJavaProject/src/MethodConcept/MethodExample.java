package MethodConcept;

public class MethodExample {
	
	void display() {
		System.out.println("this method is not having any datatype");
	}
	
	public int addition() {
		int a = 12,b =13,c=56;
		int d = a+b+c;
		return d;
	}
	public int subtract() {
		int a =100,b =50;
		int c = b-a;    //-50
		System.out.println(c);
		return c;
	}
	 
	

	public static void main(String[] args) {
		MethodExample obj  = new MethodExample();
		System.out.println(obj.addition());
		System.out.println(obj.addition());
		System.out.println(obj.addition());
		System.out.println(obj.addition());
		obj.display();
		obj.subtract();
		obj.subtract();
		obj.subtract();
		
		
		
		

	}

}
