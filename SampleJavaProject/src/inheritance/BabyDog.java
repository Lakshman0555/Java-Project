package inheritance;

public class BabyDog extends Dog {
	String name2 = "BabyDog";
	void sound2() {
		System.out.println("baby dog is crying");
	}

	public static void main(String[] args) {
		BabyDog obj = new BabyDog();
		obj.sound();  //animal
		//obj.sound1(); //dog
		obj.sound2(); //babydog
		
		System.out.println(obj.name);
		//System.out.println(obj.name1);
		System.out.println(obj.name2);
		
		

	}

}
