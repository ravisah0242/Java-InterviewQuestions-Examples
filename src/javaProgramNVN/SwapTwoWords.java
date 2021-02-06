package javaProgramNVN;

public class SwapTwoWords {

	public static void main(String[] args) {

		String a="Hello";
		String b="World";
		
		System.out.println(a+" "+b);
		System.out.println("*******************");
		
		a=a+b;	// Append and b ---> HelloWorld
		b=a.substring(0,a.length()-b.length());		 // Store 
		a=a.substring(b.length());
		
		
		System.out.println(a+" "+b);
		
		
	}

}
