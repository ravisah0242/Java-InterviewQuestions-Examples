package zz;

import java.util.Arrays;

import sun.security.util.ArrayUtil;

public class ArraySecondDeplicatePrint {

	public static void main(String[] args) {
		
		
		int[] num = {10,20,30,40,50,100};
		int delete=40;
		int count=0;
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<num.length; i++)
		{
			 if(delete==num[i])
			 {
				 for(int j=i; j<num.length-1; j++)
				 {
					 num[i]=num[j+1];
				 }
				 count =count+1;
				 break;
			 }
			 
			
		}
		if(count==0)
		{
			System.out.println("Element Not found ?? ");
		}
		else
		{
			System.out.println(Arrays.toString(num));
			System.out.println("Element Delete Sussefully ");
			for(int t=0; t<num.length; t++)
			{
				System.out.println(num[t]+" ");
			}
		}
		
		

	}

}
