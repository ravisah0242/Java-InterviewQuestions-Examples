package Ravi;

import java.util.Scanner;

public class Prime_Number
{

	public static void main(String[] args) 
	{
		int a =8;		//  for(int no =1; no<=10; no++) {  <------Add (All code are Same for 1 t0 100 prime number) 
		
		int temp=0;

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				//System.out.println(a+"  number is not prime");
				temp=temp+1;
			}
			
		}
		if(temp==0)
		{
			System.out.println(a+"  number is  prime");
		}
		else
		{
			System.out.println(a+"  Number is not prime");
		}
		
		
		
		//=================================================================================
		 System.out.println("***************************************");
		 // print all Prime Number
		 for(int no =1; no<=10; no++) {
			
			int temp1=0;
			
			for(int i=2;i<=no-1;i++)
			{
				if(no%i==0)
				{
					//System.out.println(a+"  number is not prime");
					temp1=temp1+1;
				}
				
			}
			if(temp1==0)
			{
				System.out.println(no+"  number is  prime");
			}
			else
			{
				System.out.println(no+" ************** Number is not prime");
			}
		 }
			
	}

}
