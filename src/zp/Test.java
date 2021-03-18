package zp;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
	 
		
		for(int num=1; num<=20; num++)
		{
			int temp=0;
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					temp++;
				}
			}
			if(temp==0)
			{
				System.out.println("Prime number--->"+num);
			}
			else
			{
				System.out.println("Not Prime--->***"  +num);
			}
			
		}
				
	}

}

nvt\4372