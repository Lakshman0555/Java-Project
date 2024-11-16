package keywords;

public class ThisKeyword {
	
	String n1; 
	String n2 ;   //instance
	
	
	void print() {
		System.out.println(n1);
		System.out.println(n2);
	}
	
	public ThisKeyword(String n1 ,String n2) {
		this.n1 = n1;
		this.n2 = n2;
		
	}
	
	

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword("arcus","infotech");
		
		obj.print();
		
		

	}

}
