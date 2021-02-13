package java_pawan;

import java.util.Arrays;

public class ArrayMaxAndMinNumber {

	public static void main(String[] args) {
		
		int[] numbers= {12,23,34,56,768,97,97,67,-24};
		int max=numbers[0];
		int min=numbers[0];
		
		for(int i=0; i<numbers.length; i++)
		{
			if(numbers[i]>max)
			{
				max=numbers[i];
			}
			else if(numbers[i]<min)
			{
				min=numbers[i];
			}
		}
		
		System.out.println("In Array Preset Number are :->>>"+Arrays.toString(numbers));
		
		System.out.println("Maximum Number are in Array:::--> ::--> "+max);

		System.out.println("Minmum Number in Array are ::-->  "+min);

	}

}
