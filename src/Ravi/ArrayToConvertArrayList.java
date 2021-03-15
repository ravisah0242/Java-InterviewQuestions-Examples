package Ravi;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToConvertArrayList {

	public static void main(String[] args) {
		
		
		String[] name= {"java", "Ruby","C++","java","Ruby"};
		java.util.List<String > l=new ArrayList<String>();		// for String[] Array
		Collections.addAll(l, name);
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		for(int i=0; i<l.size(); i++)
		{
			for(int j=i+1; j<l.size(); j++)
			{
				if(l.get(i).equals(l.get(j)))
				{
					System.out.println(l.get(i));
				}
			}
		}
		//====================================================================================
		/*String[] name= {"java", "Ruby","C++","java","Ruby"};
		java.util.List<String> ll=Arrays.asList(name);
		ll.remove(1);
		for(int i=0; i<ll.size(); i++)
		{
			for(int j=i+1; j<ll.size(); j++)
			{
				if(ll.get(i).equals(ll.get(j)))
				{
					System.out.println(ll.get(i));
				}
			}
		}*/
		
		//==========================================================================================
		String[] names= {"java", "Ruby","C++","java","Ruby"};
		java.util.List<String> ll=new ArrayList<String>();
		
		for(String s:names)
		{
			ll.add(s);
			
		}
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		

	}

}
