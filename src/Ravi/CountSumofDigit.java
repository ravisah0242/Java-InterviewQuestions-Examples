package Ravi;

public class CountSumofDigit {

	public static void main(String[] args) {

		int num=1234;
		int sum=0;
		int digit=0;
		
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	
		
		//=======================================================================
		int num1=1234;
		
		int sum1=0;
		
		while(num1>0)
		{
			sum1=sum1+num1%10;
			num1=num1/10;
		}
		System.out.println(sum1);
		
		/*int number=1234567;
		int rem=0;
		int sum1=0;
		
		while(number>0)
		{
			rem=number%10;
			sum1=sum1+rem;
			number=number/10;
		}
		System.out.println(number);*/
	}

}
