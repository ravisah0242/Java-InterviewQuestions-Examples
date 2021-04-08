package Ravi;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		String s="Mahabharat";
		s=s.toLowerCase();
		
		LinkedHashMap<Character, Integer>  lh=new LinkedHashMap<Character,Integer>();
		
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(lh.containsKey(ch))
			{
				Integer value=lh.get(ch);
				lh.put(ch,value+1);
			}
			else
			{
				lh.put(ch, 1);
			}
		}
		//System.out.println(lh);
		
		for(Entry<Character, Integer> entryset:lh.entrySet())
		{
			if(entryset.getValue()==4)
			{
				System.out.println(entryset.getKey());
			}
		}
		
		
		
		
		
	}

}
