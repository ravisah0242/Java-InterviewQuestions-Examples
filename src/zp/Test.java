package zp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
	 
		
		Integer[] num= {12,23,34,45,56,67,78,68,68,6867,8};
		/*Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		for(int n:num)
		{
			System.out.println(n);
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println(Arrays.toString(num));*/
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		Collections.addAll(al, num);
		
		
		Comparator<Integer> c=(a1,a2) ->a2.compareTo(a1);
		Collections.sort(num, c);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
