package Ravi;

import java.util.LinkedHashMap;

public class OccuranceWord {

	public static void main(String[] args) {


		String s="Java is a programing Language java is a best language";
		s=s.toLowerCase();
		String[] words = s.split(" ");
		
		LinkedHashMap<String, Integer> lh=new LinkedHashMap<String, Integer>();
		
		for(int i=0; i<words.length; i++)
		{
			String w = words[i];
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
