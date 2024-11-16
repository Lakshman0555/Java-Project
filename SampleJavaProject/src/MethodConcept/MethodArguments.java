package MethodConcept;

public class MethodArguments {
	public String FullName() {
		String name1 = "arcus";
		String name2 = "infotech";
		System.out.println(name1 + " " + name2);
		return name1;
	}
	public String FullName1(String name1 ,String name2) {
		String complete_name = name1+" "+name2;
		System.out.println(complete_name);
		return name1;
		
	}
	public int add(int a ,int b) {
		int c = a+b;
		System.out.println(c);
		return c;
	}

	public static void main(String[] args) {
		MethodArguments obj = new MethodArguments();
		obj.FullName();
		obj.FullName();
		obj.FullName();
		obj.FullName1("sai", "kumar");
		obj.FullName1("sirisha", "kumari");
		obj.FullName1("satish", "kumar");
		obj.add(33,44);
		obj.add(77, 88);
		

	}

}
