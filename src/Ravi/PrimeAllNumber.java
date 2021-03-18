package Ravi;

public class PrimeAllNumber {

	public static void main(String[] args) {

		
		for(int num=1; num<10; num++)
		{
			int temp=0;
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(num+ " numver is prime");
			}
			else
			{
				System.out.println(num+ " Number is not a prime");
			}
		}

	}

}
