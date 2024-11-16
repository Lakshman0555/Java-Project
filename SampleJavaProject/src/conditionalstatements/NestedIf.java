package conditionalstatements;

public class NestedIf {

	public static void main(String[] args) {
		int a = 87,b =78;
		if(a<=b) {    //true
			System.out.println("A variable is hving the highest value");
			if(b<=a) {    //true
				System.out.println("B variable is having the smallest value");
			}
		}

	}

}
