package javaGromingSauravSir;

import java.util.Comparator;

public class TreeSetMysorting implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		//return arg0.compareTo(arg1);   // Natual Sorting
		return -arg0.compareTo(arg1);  	// Customize sorting;
		
	}
}
