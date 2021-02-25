package Ravi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortandCostomizeSoet {

	public static <T> void main(String[] args) {

		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Ranjan");
		al.add("Aman");
		al.add("Zinia");
		
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		Comparator<String > c=(a1,a2) -> a2.compareTo(a1);
		Collections.sort(al, c);
		System.out.println(al);
		
		
	}

} 
