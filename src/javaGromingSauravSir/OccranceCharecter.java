package javaGromingSauravSir;

import java.util.LinkedHashMap;

public class OccranceCharecter {

	public static void main(String[] args) {
		
		String s="Mahabharat";
		LinkedHashMap<Character, Integer> lh=new LinkedHashMap<Character, Integer>();
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if(lh.containsKey(ch))
			{
				Integer value=lh.get(ch);
				lh.put(ch, value+1);
			}
			else
			{
				lh.put(ch,1);
			}
		}
		System.out.println(lh);
	}
}
