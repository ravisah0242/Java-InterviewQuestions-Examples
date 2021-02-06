package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {

		String x = "Hello";
		String y = "World";
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 23.44;
		
		System.out.println(a+b);
		System.out.println(c+d);
		
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		
		System.out.println(x+y+c+d);
		
		System.out.println(a+b+x+y+c+d);
		
		System.out.println(x+y+a+b+c+d);
		
		System.out.println("the value of a is: " + a);
		System.out.println("the value of b is: " + b);
		System.out.println("the sum of a and b is: " + (a+b));
		
		int total = 1000;
		int tax = 50;
		int balance = 100;
		
		System.out.println("Gross amount is: " + (total + tax - balance));
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(c1+c2);
		
		System.out.println(x+y+(c1+c2));
		
		
		
	}

}