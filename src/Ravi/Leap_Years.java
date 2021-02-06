package Ravi;

public class Leap_Years 
{
	public static void main(String[] args)
	{
		
		int year=2016;
		
		if((year%4==0)||(year%400==0)&& (year!=0))
		{
			System.out.println(year+":- is leap years");
		}
		else 
		{
			System.out.println(year+":- is not leap years");
		}
				
		
		
		/*if(year%4==0)
		{ 
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(year+":- is leap years");
				}
				else
				{
					System.out.println(year+":- is not leap years");
				}
				System.out.println(year+":- is leap years");
			}
			else
			{
				System.out.println(year+":- is not leap years");
			}
			System.out.println(year+":- is leap years");
		}
		else
		{
			System.out.println(year+":- is not a leap years");
		}*/
		
	////////////////////////////////////////////
		
		/*if(year%4==0)
		{
			System.out.println(year+":- is leap years");
		}
		else
		{
			System.out.println(year+":- is not leap years");
		}*/
		
	}

}
