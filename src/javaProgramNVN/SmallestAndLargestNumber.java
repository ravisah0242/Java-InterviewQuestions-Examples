package javaProgramNVN;

import java.util.Arrays;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {


		int numbers[]= {-100,29,37,77,9978,443,78,34,4233,};
		
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]>largest)
			{
				largest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		System.out.println(" \n Given Array is ::--> "+Arrays.toString(numbers));
		System.out.println("\n Smallest Number is :: --> "+ smallest);
		System.out.println("\n Largest number is ::--> "+largest);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
