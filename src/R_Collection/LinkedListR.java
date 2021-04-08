package R_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListR {

	public static void main(String[] args) {
		
		List<Integer> ar=new LinkedList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(100);
		ar.add(40);
		ar.add(50);
		ar.add(90);
		
		ar.remove(2);
		System.out.println(ar.indexOf(50));
		
		
		System.out.println(ar);
		
		List<Character> ar1=new  LinkedList<Character>();
		ar1.add('W');
		ar1.add('E');
		ar1.add('L');
		ar1.add('C');
		ar1.add('O');
		ar1.add('M');
		ar1.add('E');
		ar1.add('R');
		
		System.out.println(ar1);
		
		List<String> ar2=new  LinkedList<String>();
		ar2.add("Ravi");
		ar2.add("Ranjan");
		ar2.add("sah");
		ar2.add("Rana");
		ar2.add("Pawan");
		ar2.add("Amit");
		
		System.out.println(ar2);

	}

}
