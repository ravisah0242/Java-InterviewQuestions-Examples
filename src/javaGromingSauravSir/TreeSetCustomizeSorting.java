package javaGromingSauravSir;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetCustomizeSorting
{
		public static void main(String[] args) {
		
			TreeSet l=new TreeSet(new TreeSetMysorting());
			l.add(56);
			l.add(49);
			l.add(39);
			l.add(8);
			l.add(20);
			l.add(38);
			l.add(52);
		
			System.out.println(l); // By Default Natural sorting-->[8, 20, 38, 39, 49, 52, 56]
		
	}
}
