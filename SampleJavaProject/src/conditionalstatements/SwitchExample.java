package conditionalstatements;

public class SwitchExample {

	public static void main(String[] args) {
		String day = "wednesday";
		switch(day) {
		case "monday":
			System.out.println("Today is monday");
			break;
		case "tuesday":
			System.out.println("Today is tuesday");
			break;
		case "friday":
			System.out.println("Today is friday");
			break;
		case "wednesday":
			System.out.println("Today is wednesday");
			break;
		case "thursday":
			System.out.println("Today is thursday");
			break;
		case "saturday":
			System.out.println("Today is saturday");
			break;
		case "sunday":
			System.out.println("Today is sunday");
			break;
			default:
				System.out.println("you have entered invalid data");
		
		}

	}

}
