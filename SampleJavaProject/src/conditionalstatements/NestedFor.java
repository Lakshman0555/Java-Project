package conditionalstatements;

public class NestedFor {

	public static void main(String[] args) {
        for(int i =1;i<=5;i++) {    //row    //1
        	for(int j=1;j<=5;j++) {    //columns
        		System.out.print(i+" "+j);
        		
        	}
        	System.out.println();
        }

	}

}
