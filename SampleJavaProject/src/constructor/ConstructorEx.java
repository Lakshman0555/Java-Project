package constructor;

public class ConstructorEx {
	
	public ConstructorEx() {
		int a = 55,b =66;
		int c = a+b ;
		System.out.println(c);
	}
	
	public ConstructorEx(String name){
		System.out.println(name);
		}
	public ConstructorEx(String a ,String b,String c) {
		String d = a+ b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx();
		ConstructorEx obj1 = new ConstructorEx("Arcus Infotech");
		ConstructorEx obj2 = new ConstructorEx("abc","def","ghi");
		
		

	}

}
