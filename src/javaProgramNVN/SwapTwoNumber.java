package javaProgramNVN;

public class SwapTwoNumber {

	public static void main(String[] args) {


		int x=10;
		int y=20;
		
		/*int t;		// 1. using third veritable
		t=x;
		x=y;
		y=t;*/
		
		/*x=x+y; 		// 2. Without third veritable Using Addition operator
		y=x-y;
		x=x-y;*/
		
		/*x=x*y;		// 3. Without third veritable using product key
		y=x/y;
		x=x/y;*/
		
		x=x^y;			// 4. Without third veritable Using XOR 
		y=x^y;
		x=x^y;
		
		
		
		System.out.println(x);
		System.out.println(y);
	}

}
