package javaGromingSauravSir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySortCostomize {

	public static void main(String[] args) {


		int[] num= {999,23,33,44,55,121,54,122,8};
		
		System.out.println(Arrays.toString(num));
		// Natual Sorting;
		Arrays.sort(num);
		for(int num1:num)
		{
			System.out.print(num1+",");		
		}
		
		// Customize Sorting;
		
		Integer[] number= {12,23,33,44,55,121,54,122};
		Arrays.sort(number,Collections.reverseOrder());
		
		for(int a:number)
		{
			System.out.println(a);
		}
		

	}

}
