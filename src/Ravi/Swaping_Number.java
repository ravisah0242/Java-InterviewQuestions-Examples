package Ravi;

public class Swaping_Number 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		/*int t;		without using 3rd veritable swap two Number;
		t=a;  		Interview Quetion;
		a=b;
		b=t;*/
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("a value is = "+a);
		System.out.println("b value is = "+b);
		
	}

}
