package Ravi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Google",10000);
		hm.put("FaceBook", 20000);
		hm.put("Twitter", 30000);
		hm.put("Gmail", 390900);
		hm.put("selenium", 343434);
		
		System.out.println(hm);
		
		/*Iterator it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		Iterator it=hm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pr=(Map.Entry)it.next();
			System.out.println(pr.getKey()+" -- "+pr.getValue());
		}
		
		List<String > l=new ArrayList<String>(hm.keySet());
		System.out.println(l);
		for(String s:l)
		{
			System.out.println(s);
		}
		
		List<Integer > l1=new ArrayList<Integer>(hm.values());
		System.out.println(l1);
		for(int n:l1)
		{
			System.out.println(n);
		}
		
		
		
		
		
		
		
		

	}

}
