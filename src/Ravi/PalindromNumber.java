package Ravi;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int num=121;
		int rev=0;
		int org=num;
		
		while(num>0)
		{
			rev=rev*10+num/10;
			num=num/10;
		}
		if(org==rev)
		{
			System.out.println(org+"--> This is Palindrom Number");
		}
		else
		{
			System.out.println(org+ " This is not A Palindrom Number");
		}

	}

}
