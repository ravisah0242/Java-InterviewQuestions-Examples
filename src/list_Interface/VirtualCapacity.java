package list_Interface;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {


		ArrayList<Object> ar=new ArrayList<Object>();
		
		System.out.println(ar.size()); //physical Capacity = 0;
		
		ar.add(100);
		
		System.out.println(ar.size()); //physical Capacity = 1;

		ar.add(200);
		ar.add(230);
		ar.add(220);
		ar.add(20);
	}

}
