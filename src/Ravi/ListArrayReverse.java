package Ravi;

import java.util.ArrayList;
import java.util.Collections;

public class ListArrayReverse {

	public static void main(String[] args) {


		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		al.add(220);
		al.add(300);
		al.add(150);
		al.add(900);
		
		System.out.println(al);	// [100, 200, 220, 300, 150, 900]
		
		Collections.sort(al); //Sort the element
		System.out.println(al);	// [100, 150, 200, 220, 300, 900]
		
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(100);
		al1.add(200);
		al1.add(220);
		al1.add(300);
		al1.add(150);
		al1.add(900);
		
		Collections.sort(al1,Collections.reverseOrder());
		System.out.println(al1);	
		
	}

}
