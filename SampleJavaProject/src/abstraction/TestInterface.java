package abstraction;

public class TestInterface implements InterfaceEx {
	
         public void show() {
        	 System.out.println("This is abstract method implementation");
         }
         public void print() {
        	 System.out.println("This is abstract method implemnetation");
         }
	public static void main(String[] args) {
		
		InterfaceEx  obj =  new TestInterface();     //upcasting 
		TestInterface obj1 = new TestInterface();
		obj.show();
		obj.print();
		obj1.show();
		obj1.print();
		
		

	}

}
