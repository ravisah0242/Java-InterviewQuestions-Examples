package javaProgramNVN;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateElement {

	public static void main(String[] args) {

		String names[]= {"Java","JavaScript","Ruby","C","Python","Java", "Java"}; ///->Java, Java, Java
		
		// 1. Compare each element : 0(nxn)--worst Solution
		for(int i=0; i<names.length; i++)
		{
			for(int j=i+1; j<names.length; j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element are::-->"+ names[i]);
				}
			}
		}
		
		// 2. Using HashSet:--> Java Collection:--> it Store Unique Value: O(n)
		Set<String> store =new HashSet<String>();
		for(String name:names)
		{
			if(store.add(name)==false)
			{
				System.out.println("Using Set Interface- Duplicate Element are::-->"+name);
			}
		}
		
		
		// 3. Using HashMap:---> O(2n)
		Map<String, Integer> storeMap=new HashMap<String, Integer>();
		
		for(String name:names)
		{
			Integer count = storeMap.get(name);
			if(count==null)
			{
				storeMap.put(name, 1);
			}
			else
			{
				storeMap.put(name, ++count);
			}
		}
		
		
		// Get the Value from This HashMap:
		
		Set<Entry<String, Integer>> entrySet=storeMap.entrySet();
		for(Entry<String, Integer> entry:entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate Element is ::"+entry.getKey());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
