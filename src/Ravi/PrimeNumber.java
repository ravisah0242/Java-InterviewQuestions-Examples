package Ravi;

public class PrimeNumber {

	public static void main(String[] args) {


		int a=5;
		int temp = 0;
		
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("is a prime Number");
		}
		else
		{
			System.out.println("not a peime number");
		}
	}

}
