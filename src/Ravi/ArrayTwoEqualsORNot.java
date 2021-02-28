package Ravi;

import java.util.Arrays;

public class ArrayTwoEqualsORNot {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6};
		int[] b={1,2,3,4,5,6,7};

		// 1 Approach Compare Two Array Are Equals on not ?
		boolean status=Arrays.equals(a, b);
		
		if(status==true)
		{
			System.out.println("Both Arrays Are Equal ");
		}
		else
		{
			System.out.println("Both Array are Not Equals");
		}

		// 2  Approach Compare Two Array Are Equals on not ?
		
		/*boolean status=true;
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length; i++)
			{
				if(a[i]!=b[i])
				{
					status=false;
				}
			}
			
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Array are Equal::---");
		}
		
		else
		{
			System.out.println("Array Are not Euals");
		}*/
		
		
	}

}
