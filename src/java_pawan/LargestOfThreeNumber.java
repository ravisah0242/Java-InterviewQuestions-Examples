package java_pawan;

public class LargestOfThreeNumber {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=30;
		
		if(a>b&&a>c)
		{
			System.out.println("A ia gratter number");
		}
		else if(b>a&&b>c)
		{
			System.out.println("B is Gratter Number");
		}
		else
		{
			System.out.println("C is Gratter Number");
		}
		
		/*int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		
		 System.out.println("Largest Number are:: - "+largest2);*/
		
	}

}
