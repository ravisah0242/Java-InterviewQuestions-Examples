package JavaSessions;

public class DecrementAndIncrementOperators {
	
	public static void main(String[] args) {

		//++ and --
		
		int a = 1;
		int b = a++; //post increment
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = -99;
		int d = c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		//pre increment:
		int m = 1;
		int n = ++m;
		System.out.println(m);//2
		System.out.println(n);//2
		
		//post decrement:
		int p = 2;
		int q = p--;
		System.out.println(p);//1
		System.out.println(q);//2
		
		int g = -101;
		int h = g--;
		System.out.println(g);//-102
		System.out.println(h);//-101
		
		
		//pre decrement:
		int x = 2;
		int y = --x;
		System.out.println(x);//1
		System.out.println(y);//1
		
		
		int v = 2;
		System.out.println(v++);//2
		System.out.println(v);//3
		
		int o = 5;
		System.out.println(++o);
		System.out.println(o);
		
		int r = 10 % 3;
		System.out.println(r);
		
		//System.out.println(9/0);//ArithmeticException: / by zero
		
		System.out.println(0/9);
		
		byte b1 = 0123;//octal number (base = 8)
		System.out.println(b1); //octal to decimal number
		
		//065 = 8^0x5
		//065 = (0 × 8²) + (6 × 8¹) + (5 × 8⁰) = 53
		
		
		
		
	}

}
