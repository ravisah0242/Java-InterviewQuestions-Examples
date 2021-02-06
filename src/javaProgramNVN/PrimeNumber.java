package javaProgramNVN;

public class PrimeNumber {

	public static void main(String[] args) {


		int num =56;
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
			System.out.println(num + " Number is prime ");
		}
		else
		{
			System.out.println(num+ " Number is Not a Prime");
		}
	}

}
