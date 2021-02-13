package java_pawan;

public class FactorialNumber {

	public static void main(String[] args) {


		int a=7;
		int fact=1;
		
		/*for(int i=1; i<=a; i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" ---> "+fact);*/
		
		for(int i=a; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" ---> "+fact);
		
	}

}
