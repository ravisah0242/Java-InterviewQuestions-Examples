package Ravi;

import java.util.ArrayList;

public class ArrayListToConvertArray {

	public static void main(String[] args) {
		
		
		java.util.List<Integer > list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(50);
		list.add(60);
		list.add(50);
		
		Integer[] intArray=new Integer[list.size()];
		list.toArray(intArray);
		for(Integer no:intArray)
		{
			System.out.println(no);
		}

	}

}
