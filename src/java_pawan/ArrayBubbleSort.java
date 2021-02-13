package java_pawan;

import java.util.Arrays;

public class ArrayBubbleSort {

	public static void main(String[] args) {
		
		int[] num= {12,23,340,2,3,12,99};
		
		System.out.println(Arrays.toString(num));
		
		int leng=num.length;
		
		for(int i=0; i<leng-1; i++)
		{
			for(int j=0; j<leng-1; j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array  After Sorting "+Arrays.toString(num));
	}

}
