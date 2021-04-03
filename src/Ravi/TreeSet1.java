package Ravi;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		Set<String> s=new TreeSet<String>();
		
		s.add("Zinia");
		s.add("Aman");
		s.add("Ravi");
		s.add("Pawan");
		s.add("Amit");
		System.out.println(s);
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		

	}

}
