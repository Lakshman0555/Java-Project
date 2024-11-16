package abstraction;

public class methdOverloading {
	
	public int add() {
		int a =90,b=60;
		int c = a+b;
		System.out.println(c);
		return c;
	}

	public int add(int a ,int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}
	
	public int add(int a) {
		
		return a;
		
	}
	 public int add(int a ,int b,int c) {
		 return c;
	 }

	public static void main(String[] args) {
		methdOverloading obj = new methdOverloading();
		obj.add();
		obj.add();
		obj.add();
		obj.add(13, 14);
		obj.add(66, 9);
		obj.add(300, 900);
		

	}

}
