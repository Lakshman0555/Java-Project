package conditionalstatements;

import java.util.Scanner;

public class IfElseIF {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a variable value here:");
		 int a = sc.nextInt();
		 System.out.println("Enter b variable value here:");
		 int b = sc.nextInt();
		
		 if(a>b) {
			System.out.println("a value is the highest value than b value");
		}
		else if(b>a) {
			System.out.println("b value is the highest value than a value");
		}
		else {
			System.out.println("both values are equal ");
		}
	}

}
