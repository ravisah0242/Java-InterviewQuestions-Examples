package javaProgramNVN;

public class FindMissingNumber {

	public static void main(String[] args) {

		// Missing Number only for Sequence order like below code
		int a[]= {1,2,3,4,5,7};
		int sum = 0;
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum + a[i];
		}
		System.out.println(" Sum of Array Number sum --->"+sum);
		
		for(int j=1; j<=7; j++)
		{
			sum1=sum1+j;
		}
		System.out.println(" Sum of Array Number sum --->"+sum1);
		
		System.out.println(" Missing Number is::-->"+(sum-sum1));
		
		
	}

}
