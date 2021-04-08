package np;

import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<String> store=new TreeSet<String>(new MyCompareTor());
		
		store.add("Ravi");
		store.add("Ranjan");
		store.add("Kumar");
		store.add("Pawan");
		store.add("Pusha");
		store.add("Zinia");
		store.add("Amit");
		
		
		System.out.println(store);
		
		
		
		
		
		
		

	}

}
