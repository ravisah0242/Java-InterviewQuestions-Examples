package Ravi;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		
		Map<Integer , String> t=new TreeMap<Integer, String>();	
		t.put(1,"Ravi");
		t.put(3, "KK");
		t.put(2, "Amit");
		t.put(1,"Zinia");
		
		System.out.println(t);
		
		for(Entry<Integer, String> tr:t.entrySet())
		{
			System.out.println("key = " + tr.getKey() + " value = " + tr.getValue());
		}
		
		

	}

}
