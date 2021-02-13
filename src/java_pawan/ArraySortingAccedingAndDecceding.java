package java_pawan;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingAccedingAndDecceding {

	public static void main(String[] args) {


		int[] num= {12,23,34,45,99999,34,6};
		
		System.out.println(Arrays.toString(num));
		
		
		// Approach 1 to Sort the Arrays------> Acceding Order
		Arrays.sort(num);
		for(int num1:num)
		{
			System.out.println(num1); 				// [6, 12, 23, 34, 34, 45, 99999]  But Next Line 
		}
		// OR
		Arrays.sort(num);							// Approach 2 to Sort the Arrays------>  Acceding Order
		System.out.println(Arrays.toString(num));  	// [6, 12, 23, 34, 34, 45, 99999]

		// Approach 3 to Sort the Arrays------>   Acceding Order
		Arrays.parallelSort(num);
		System.out.println(Arrays.toString(num));	// [6, 12, 23, 34, 34, 45, 99999]
		
		// Decceding Order
		Integer[] num1= {12,23,34,45,99999,34,6};
		Arrays.sort(num1,Collections.reverseOrder());
		System.out.println("Array Decending Order:::-->"+Arrays.toString(num1));		
	}

}