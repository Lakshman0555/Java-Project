package stringoperations;

public class StringObj {

	public static void main(String[] args) {
		String s1 = new String("arcus");   
		String s2 = "arcus";  //infotech   //m1
		
		s2.concat("infotech");
		
		System.out.println(s2);    //arcus infotech
		String s3 = s2.concat("infotech");   //arcus infotech
				System.out.println(s3);
		
	s3.concat("ameerpet");     
	System.out.println(s3);       //arcus infotech ameerpet
	String s4 = s3.concat("ameerpet");
	System.out.println(s4);
	System.out.println("--------------------------------------------------");
	String s5 = "sachin";
	//sachin tendulkar
	s5.concat("tendulkar");         //sachin tendulkar
	System.out.println(s5);
	String s6 = s5.concat(" tendulkar");
	System.out.println(s6);
	System.out.println(s5);
	
	StringBuilder sb = new StringBuilder("arcus");
	sb.append("  infotech");
	System.out.println(sb);
	
	StringBuffer sb1 = new StringBuffer("satish");
	sb1.append(" kumar");
	System.out.println(sb1);
	
	String s = "     abhishek kumar ";
	System.out.println(s.concat(" is a student"));
	System.out.println(s);   
	System.out.println(s.charAt(10));
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.contains("sheek"));
	System.out.println(s.endsWith("mar"));
	System.out.println(s.indexOf('i'));
	System.out.println(s.isEmpty());
	String s0 = "";
	System.out.println(s0.isEmpty());
	System.out.println(s.length());
	System.out.println(s.replace('m', 'n'));
	System.out.println(s.replace("abhishek", "ankit"));
	System.out.println(s.repeat(5));
	System.out.println(s.substring(9,14));
	System.out.println(s.trim());
	
	
	
	
	
		

	}

}
