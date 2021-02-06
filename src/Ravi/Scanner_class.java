package Ravi;

import java.util.Scanner;

public class Scanner_class 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.next();
		System.out.println("Enter Your age");
		int a=sc.nextInt();
		System.out.println("Enter Your Phone Number");
		long l=sc.nextLong();
		System.out.println("Enter your Gender");
		char c=sc.next().charAt(0);
		
	}

}
