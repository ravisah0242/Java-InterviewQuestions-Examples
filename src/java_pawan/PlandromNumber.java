package java_pawan;

public class PlandromNumber {

	public static void main(String[] args) {


		int num=121;
		int org=num;
		int rev=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(" --> Reverse  "+rev);
		
		if(org==rev)
		{
			System.out.println(org+" this is Palandrom Number");
		}
		else
		{
			System.out.println(org+" This is not a plandrm Number");
		}

	}

}
