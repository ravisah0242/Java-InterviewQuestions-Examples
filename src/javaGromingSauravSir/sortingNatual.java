package javaGromingSauravSir;

import java.util.ArrayList;
import java.util.Collections;

public class sortingNatual {

	public static void main(String[] args) {
		
		
		// 1. Comparable :--> DNSO ( default Natural sorting Order ) :--> Number/Alphabet
		
		// 2. Comparator :--> Customize sorting order;
		
		ArrayList l=new ArrayList();
		l.add(56);
		l.add(50);
		l.add(57);
		l.add(55);
		l.add(23);
		l.add(100);
		System.out.println(l); // [56, 50, 57, 55, 23, 100]
		
		Collections.sort(l);
		System.out.println(l);	// [23, 50, 55, 56, 57, 100]
		
		
		/*ArrayList<Integer> al1=new ArrayList<Integer>(new MySortArray());
		al1.add(100);
		al1.add(200);
		al1.add(220);
		al1.add(300);
		al1.add(150);
		al1.add(900);
		
		System.out.println(al1);	
		//Collections.sort(l, );
		*/
		
		
		
	}
}
