package javaGromingSauravSir;

import java.util.Collections;
import java.util.TreeSet;

public class TreesSetsorting {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> l=new TreeSet<Integer>();
		l.add(56);
		l.add(49);
		l.add(39);
		l.add(8);
		l.add(20);
		l.add(38);
		l.add(52);
		
		System.out.println(l); // By Default Natural sorting-->[8, 20, 38, 39, 49, 52, 56]
		
		//Collections.sort(l);   // don't work like this;
			
	}

}
