package zp;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	public static void main(String[] args) {
		
		int[] num= {12,23,3344,55,66,77,88,99};
		
		System.out.println(Arrays.toString(num));
		
		/*Arrays.sort(num);
		// System.out.println(Arrays.toString(num));   // OR
		for(int num1:num)
		{
			System.out.println(num1);
		}*/
		
		Arrays.parallelSort(num);
		for(int i=0; i<num.length; i++)
		{
			System.out.println(num[i]);
		}
		
		
		// Reverse Order Sorting
		Integer[] num2= {12,23,3344,55,66,77,88,99};
		
		Arrays.sort(num2, Collections.reverseOrder());
		System.out.println(Arrays.toString(num2));
		

	}

}
