package R_Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetR {

	public static void main(String[] args) {
		
		Set<Integer> ar=new  HashSet<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(100);
		ar.add(40);
		ar.add(50);
		ar.add(90);
		
		ar.remove(2);
		
		
		System.out.println(ar);
		
		Set<Character> ar1=new  HashSet<Character>();
		ar1.add('W');
		ar1.add('E');
		ar1.add('L');
		ar1.add('C');
		ar1.add('O');
		ar1.add('M');
		ar1.add('E');
		ar1.add('R');
		
		System.out.println(ar1);
		
		Set<String> ar2=new  HashSet<String>();
		ar2.add("Ravi");
		ar2.add("Ranjan");
		ar2.add("sah");
		ar2.add("Rana");
		ar2.add("Pawan");
		ar2.add("Amit");
		
		System.out.println(ar2);


	}

}
