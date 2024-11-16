package package11;

public class First {
	public  String variable = "private variable";
	
	 public void private1() {
		System.out.println("This is private method");
	}

	public static void main(String[] args) {
		First obj = new First();
		obj.private1();
		System.out.println(obj.variable);
		

	}

}
