package javaGromingSauravSir;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicateWord {

	public static void main(String[] args) {
		
		// 1. Compare each element : 0(nxn)--worst Solution

		String[] names= {"Java", "Python", "Ruby", "Java", "C#", "Java", "java", "java","Ruby"};  // mutliple elemenet find
		
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element are ::"+names[i]); 
					// multiple element print java java java java(its only for two element compare )
				}
			}
		}
		
		// 2. Using HashSet:--> Java Collection:--> it Store Unique Value: O(n)
		
		String []name2={"Java", "Python", "Ruby", "Java", "C#", "Java", "java", "java","Ruby"};
		
		Set<String> store=new HashSet<String>();
		
		for(String str:name2)
		{
			if(store.add(str)==false)
			{
				System.out.println("deplicate are::"+str);
			}
		}
	}

}
