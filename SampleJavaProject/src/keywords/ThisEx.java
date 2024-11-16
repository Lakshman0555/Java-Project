package keywords;

public class ThisEx {
	
	public ThisEx() {
		System.out.println("First constructor block");
	}
	
	public ThisEx(String n1) {
		this();
		System.out.println(n1);
	}
	public ThisEx(int a ,int b) {
		this("rithish");
		System.out.println(a + "  "+b);
	}
	public static void main(String [] args) {
		ThisEx obj = new ThisEx(5,6);
		
	}

}
