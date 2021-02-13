package java_pawan;

public class SwapTwoNumber {

	public static void main(String[] args) {

		// 5 Way Swap two Number----------->>> 555555555555555555 >>>>>
		int a=10;
		int b=20;
		int t;
		// 1. way to Swap two Number without 3rd Variable;
		b=a+b-(a=b);
		System.out.println(a+" "+b);
		
		/*// 2. way Swapping two Number using 3rd Variable;
		t=a;
		a=b;
		b=t;
		System.out.println(" **********   1. way Swapping two Number using 3rd Variable*******************");
		System.out.println(a);
		System.out.println(b);*/
		
		/*// 3 way Swapping two Number without using 3rd Variable;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(" **********   2. way Swapping two Number without using 3rd Variable*******************");
		System.out.println(a);
		System.out.println(b);*/
		
		/*// 4. way Swapping two Number without using 3rd Variable;
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(" **********   3. way Swapping two Number using Product operation*******************");
		System.out.println(a);
		System.out.println(b);*/
		
		// 5. way Swapping two Number using XOR Operator;
		/*a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(" **********   4. way Swapping two Number using XOR Operator*******************");
		System.out.println(a);
		System.out.println(b);*/
		
		

	}

}
