package R_Collection;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class CollectoinConcept {

	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<String>(new MyComparator());
		
		t.add("Ravi");
		t.add("OM");
		t.add("Prakesh");
		t.add("Zinia");
		t.add("Amit");
		
		t.add("Z");
		
		
		System.out.println(t);
		
		
		
		
		
		
		
		
		
		

	}

}
