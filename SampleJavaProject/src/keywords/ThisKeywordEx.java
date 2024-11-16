package keywords;

public class ThisKeywordEx {
	void work() {
		System.out.println("working"); 
	}
   void eat() {
	   this.work();
	   System.out.println("eating");
   }
   void sleep() {
	   this.eat();
	   System.out.println("sleeping");
   }
	public static void main(String[] args) {
		ThisKeywordEx obj = new ThisKeywordEx();
		obj.sleep();
		

	}

}
