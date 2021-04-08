package Ravi;

public class CountNumberDigit {

	public static void main(String[] args) {
		
		
		int num=1234556567;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Count the Number of Digit --> "+count);

	}

}
