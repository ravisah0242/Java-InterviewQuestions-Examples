package vikash;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNaturalSorting {
	
	//sort arraylist using natural sorting 

	
		public static void main(String[] args){
			ArrayList list= new ArrayList();
			list.add(4);
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(9);
			list.add(5);
			Collections.sort(list);
			System.out.print(list);
	}

}
