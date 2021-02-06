package Ravi;

import java.util.Comparator;

public class Copmrator1  implements Comparator<Integer>
{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		if(arg0>arg1)
		return 0;
		return arg1;
	}
	 

}
