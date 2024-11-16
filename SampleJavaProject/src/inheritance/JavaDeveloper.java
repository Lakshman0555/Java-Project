package inheritance;

public class JavaDeveloper extends Company{
	String designation = "java_developer";
	void work1() {
		System.out.println("developer is working on java project");
	}

	public static void main(String[] args) {
		 JavaDeveloper jd = new JavaDeveloper();
		 jd.work();
		 jd.work1();
		 System.out.println(jd.com_name);
		 System.out.println(jd.designation);

	}

}
