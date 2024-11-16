package keywords;

public class StaticEx {
	int product_no = 5566;                         //instance
	static String product_name = "lagguage";     //static
	
	static void print() {
		System.out.println("This is static method implementation");
	}
	

	public static void main(String[] args) {
		StaticEx obj = new StaticEx();
		System.out.println(obj.product_no);
		System.out.println(product_name);           
		System.out.println(StaticEx.product_name);
		obj.print();    
		print();
		StaticEx.print();
	

	}

}
