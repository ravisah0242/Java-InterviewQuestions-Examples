package Ravi;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num=121099;
		int rev=0;
		int org=num;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		
		if(org==rev)
		{
			System.out.println("Palondrom Number");
		}
		else
		{
			System.out.println("Not a Paloandrom Number");
		}

	}

}
