package polymorphism;

public class StaticBinding {
	public int add(int a ,int b) {
		int c = a+b;
		System.out.println(""+c);
		return c;
	}
	public int add(int a,int b,int c) {
		int d = a+b+c;
		System.out.println(d);
		return d;
	}

	public static void main(String[] args) {
		StaticBinding obj = new StaticBinding();
		obj.add(300, 400, 500);    
		obj.add(500, 1000);      

	}

}
