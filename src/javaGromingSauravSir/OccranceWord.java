package javaGromingSauravSir;

import java.util.LinkedHashMap;

public class OccranceWord {

	public static void main(String[] args) {

		String s="Nirma washin pawer dudh ki safai nirma sab ki pasand";
		LinkedHashMap<String , Integer> lh=new LinkedHashMap<String, Integer>();
		s=s.toLowerCase();		
		String[] words = s.split(" ");
		for(int i=0; i<words.length; i++)
		{
			String w=words[i];	
			if(lh.containsKey(w))
			{
				Integer value=lh.get(w);
				lh.put(w, value+1);
			}
			else
			{
				lh.put(w, 1);
			}
		}
		System.out.println(lh);
	}
}
