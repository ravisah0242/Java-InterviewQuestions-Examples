package Ravi;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInString {

	public static void main(String[] args) {

		// 1 way simple for loop:--->
		String[] names= {"java", "Python", "java", "Ruby", "C#", "C++","Ruby"};
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equals(names[j]))		// .equals or == ;
				{
					System.out.println("duplicate aelement are---> "+names[i] );
				}
			}
		}
		// 2 way Using set interface
		Set<String> store=new HashSet<String>();
		for(String str:names)
		{
			if(store.add(str)==true)
			{
				System.out.println("Using Set Interface:--> "+ str);
			}
		}		
	}

}
