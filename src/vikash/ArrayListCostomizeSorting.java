package vikash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListCostomizeSorting {
	
	//sort arraylist using customized sorting 

	
		public static void main(String[] args){
			ArrayList<Integer> list= new ArrayList<Integer>();
			list.add(4);
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(9);
			list.add(5);
			
			Collections.sort(list);
			System.out.println(list);  // Natural sorting
			
			Comparator<Integer> c=(a1,a2) ->a2.compareTo(a1);   // CUstomise Sorting
			Collections.sort(list,c);
			System.out.println(list);
			
			
	}

}
