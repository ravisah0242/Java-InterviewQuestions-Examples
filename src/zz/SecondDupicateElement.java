package zz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondDupicateElement {

	public static void main(String[] args) {
		
		
		int[] num= {12,23,34,45,55,66,77,88,77,66};
				
		List<Integer> ll=new ArrayList<Integer>();
		for(int no:num)
		{
			ll.add(no);
		}
		
		System.out.println(ll);
		
		ll.remove(6);
		for(int i=0; i<ll.size();i++)
		{
			for(int j=i+1; j<ll.size(); j++)
			{
				if(ll.get(i).equals(ll.get(j)))
				{
					System.out.println("Using Array to Conver Array List the second Duplicate Element Are ->> "+ll.get(j));
				}
			}
		}
		
		
		
		for(int i=0; i<num.length; i++)
		{
			for(int j=i+1; j<num.length; j++)
			{
				if(num[i]==num[j])
				{
					System.out.println("Duplicate Element Are in Array  -->"+num[j]);
				}
			}
		}
		
		
	}

}
