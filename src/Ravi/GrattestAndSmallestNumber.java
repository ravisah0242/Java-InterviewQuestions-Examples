package Ravi;

import java.util.Arrays;

public class GrattestAndSmallestNumber {

	public static void main(String[] args) {
		
		int[] num= {12,23,34,45,56,67,-12,34,101};
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<num.length; i++)
		{
			if(num[i]>max)
			{
				max=num[i];
			}
			else if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println(max);
		System.out.println(min);

	}

}
