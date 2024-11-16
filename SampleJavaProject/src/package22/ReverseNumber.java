package package22;

public class ReverseNumber {

	public static void main(String[] args) {
		int v =123;
		int f,m,l,rev;
		f = v/100;
		m = (v/10)%10;
		l = v%10;
		rev = l*100+m*10+f;
		System.out.println("reverse of a number:"+rev);

	}

}
