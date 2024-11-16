package conditionalstatements;

public class IfElseIf1 {

	public static void main(String[] args) {
		int  i = 9;
		if(i>=50 && i<=60) {
			System.out.println("The student got D grade");
		}
		else if(i>=61 && i<=70) {
			System.out.println("The student got C grade");
		}
		else if(i>=71 && i<=80) {
			System.out.println("The student got B grade");
		}
		else if(i>=81 && i<=90) {
			System.out.println("The student got A grade");
		}
		else if(i>=91 && i<=100) {
			System.out.println("The student got A+ grade");
		}
		else if(i>100) {
			System.out.println("please enter the valid marks");
		}
		else {
			System.out.println("The student got failed");
		}

	}

}
