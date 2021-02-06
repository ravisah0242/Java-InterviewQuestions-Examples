package vikash;

import java.util.Arrays;

public class ArraySort {
	
	
	// write a program to sort an array

		public static void main(String[] args){
			int[] x={3,1,6,2,9,0,5};

			Arrays.sort(x);

			for(int x1:x)
			{
				System.out.print("Sorted array is====>>>"+ x1);
			}
		}

}
