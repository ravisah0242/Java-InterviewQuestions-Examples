package zp;

import java.util.Arrays;

public class FindSmallestandGratterNumber {

	public static void main(String[] args) {


		int[] numbers= {-100,200,26,40,56,3233,8,999};
		int smallest=numbers[0];
		int grattest=numbers[0];
		
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i]>grattest)
			{
				grattest=numbers[i];
			}
			else if(numbers[i]<smallest)
			{
				smallest=numbers[i];
			}
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(smallest);
		System.out.println(grattest);

	}

}
