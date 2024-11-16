package MethodConcept;

public class OverloadingEx {
	
	int add() {
		int a = 50 ,b = 60;
		int c = a+b;
		System.out.println(c);
		return c;
	}
	int add(int a ,int b ) {
		int c =a+b ;
		System.out.println(c);
		return c;
	}
	int add(int c) {
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		OverloadingEx obj = new OverloadingEx();
		obj.add();
		obj.add(434, 223);
		obj.add(2200);
		
		

	}

}
