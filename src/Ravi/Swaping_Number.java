package Ravi;

public class Swaping_Number 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		System.out.println(a+"--"+b);
		
		// 1  Approach
		/*int t;		without using 3rd veritable swap two Number;
		t=a;  		Interview Quetion;
		a=b;
		b=t;*/
		
		// 2 nd Approach
		/*a=a+b;
		b=a-b;
		a=a-b;*/
		
		// 3 Approach
		//b=a+b-(a=b);
		
		// 4 th Approach
		/*a=a*b;
		b=a/b;
		a=a/b;*/
		
		// 5 th Approach
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println(a+"--"+b);
		
	}

}
