package Ravi;

import java.util.Comparator;

public class Mysorting implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		return arg0.compareTo(arg1);
		//return -arg0.compareTo(arg1);
		
	}
}
