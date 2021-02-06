package javaProgramNVN;

public class ReverseInteger {

	public static void main(String[] args) {

		int num=123456;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Number is--> "+rev);
		
		
		//int num1=1234;
		//System.out.println(new StringBuffer(String.valueOf(num1).rev));
		
		int num1=2345678;
		int rev1=0;
		while(num1!=0)
		{
			rev1=rev1*10+num1%10;
			num1=num1/10;
		}
		System.out.println(rev1);
		
		
		
		
		
	}

}
