package Ravi;

public class ArrayEvenAndOddNumber {

	public static void main(String[] args) {

		int[] num= {1,2,3,4,5,6,7,55,33,44,22,24};
		
		for(int value:num)
		{

			if(value%2==0)
			{
				System.out.println("Even Numver from Array::- "+value);
			}
		}
		for(int value:num)
		{

			if(value%2!=0)
			{
				System.out.println("Odd Numver from Array-------------> "+value);
			}
		}
		
		/*for(int i=0; i<num.length; i++)
		{
			if(num[i]%2==0)
			{
				System.out.println("Even Numver from Array::- "+num[i]);
			}
			else
			{
				System.out.println("Odd Numver from Array-------------> "+num[i]);
			}
			
			// OR
		}
		for(int i=0; i<num.length; i++)
		{
			if(num[i]%2!=0)
			{
				System.out.println("Odd Numver from Array-------------> "+num[i]);
			}
		}*/

		
		
		
	}

}
