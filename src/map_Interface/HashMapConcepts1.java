package map_Interface;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts1 {

	public static void main(String[] args) {

		HashMap<String,Integer> hm=new HashMap<String, Integer>();
		hm.put("Java", 100);
		hm.put("Selenium", 200);
		hm.put("Data Base",120);
		hm.put("Ruby", 300);
		hm.put(null, 500);				// First Print of null value its Store in 0 index/Segment 
		hm.put(null, 600);
		System.out.println(hm);
		
		/*for(int i=0; i<hm.size(); i++) 	// using simple for loop not print the HashMap key and Value; 
		{
			System.out.println(hm.get);
		}*/
		
		for(Entry m:hm.entrySet())
		{
			System.out.println("Key -->    "+m.getKey() +";  and Value:-->  "+m.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
