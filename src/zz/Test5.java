package zz;

import java.util.Arrays;
import java.util.LinkedList;

public class Test5 {

	public static void main(String[] args) {
		
		LinkedList<String > ll=new LinkedList<String>();
		ll.add("java");
		ll.add("Ruby");
		ll.add("C++");
		ll.add("java");
		System.out.println(ll);
		
		for(int i=0; i<ll.size(); i++)
		{
			for(int j=i+1; j<ll.size(); j++)
			{
				if(ll.get(i).equals(ll.get(j)))
				{
					System.out.println(ll.get(i));
				}
			}
		}
		
		
		
	}

}
