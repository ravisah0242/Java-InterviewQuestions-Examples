package java_pawan;

import java.util.Arrays;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5,7};
		int sum=0;
		int sum1=0;
		
		for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		for(int j=1; j<=7; j++)
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("Missing Number Are ::-->  "+(sum1-sum));
		
		
		
		

	}

}
