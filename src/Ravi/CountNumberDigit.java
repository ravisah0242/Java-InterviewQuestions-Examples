package Ravi;

public class CountNumberDigit {

	public static void main(String[] args) {
		
		
		int Number=1234556567;
		int count=0;
		
		while(Number>0)
		{
			Number=Number/10;
			count++;
		}
		System.out.println("Count the Number of Digit --> "+count);

	}

}
