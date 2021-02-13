package zp;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] num= {12,23,45,56,67,78,99};
		int sum=0;
		
		for(int i=0; i<num.length; i++)
		{
			sum=sum+num[i];
		}
		
		System.out.println("Sum of Array of ::--> = "+sum);
	}

}
