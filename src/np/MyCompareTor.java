package np;

import java.util.Comparator;

public class MyCompareTor  implements Comparator<String>
{

	@Override
	public int compare(String arg0, String arg1) {
		
		//return arg0.compareTo(arg1);    // Natuarl Sorting;
		
		return -arg0.compareTo(arg1);     //  Customize Sorting;
		
	}
	

}
