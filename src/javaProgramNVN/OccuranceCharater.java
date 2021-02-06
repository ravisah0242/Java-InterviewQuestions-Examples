package javaProgramNVN;

import java.util.LinkedHashMap;

public class OccuranceCharater {

	public static void main(String[] args) {


		String name="Mahabharat";
		name=name.toLowerCase();
		
		LinkedHashMap<Character, Integer> lh=new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<name.length(); i++)
		{
			char ch=name.charAt(i);
			if(lh.containsKey(ch))
			{
				Integer value = lh.get(ch);
				lh.put(ch, value+1);
			}
			else
			{
				lh.put(ch, 1);
			}			
		}
		System.out.println(lh);
	}

}
