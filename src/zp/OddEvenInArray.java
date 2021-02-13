package zp;

public class OddEvenInArray {

	public static void main(String[] args) {
		
		int[] num= {12,23,34,45,56,67,78,89,90,98,87,65,45,44,33,22,11,22};
		
		for(int value:num)
		{
			if(value%2==0)
			{
				System.out.println("Even Number::--> "+ value);
			}
			/*else
			{
				System.out.println("<<<<Odd Number>>>>>>> "+value);
			}*/
		}
		for(int value1:num)
		{
			if(value1%2!=0)
			{
				System.out.println("<<<<<<Odd Number>>>>>>   "+value1);
			}
		}

	}

}
