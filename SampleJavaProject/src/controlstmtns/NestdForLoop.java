package controlstmtns;

public class NestdForLoop {

	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {     //rows 1
			for(int j =1;j<=i;j++) {   //columns   //1   2
				System.out.print("*  ");
			}
			System.out.println();
		}

	}

}
