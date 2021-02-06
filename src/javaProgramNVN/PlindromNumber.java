package javaProgramNVN;

public class PlindromNumber {

	public static void main(String[] args) {


		int no=121;
		int temp=no;
		int rev=0;
		int rem;
		
		while(temp !=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+" :--> is a Palindrom Number");
		}
		else
		{
			System.out.println(no+ " Number is not apalindrom Number");
		}

	}

}
