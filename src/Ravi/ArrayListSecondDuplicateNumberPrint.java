package Ravi;

import java.util.ArrayList;

public class ArrayListSecondDuplicateNumberPrint {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(30);
		al.add(50);
		al.add(50);
		
		al.remove(6);		
		
		for(int i=0;i<al.size(); i++)
		{
			for(int j=i+1; j<al.size(); j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					System.out.println(al.get(i));
				}
			}
		}

	}

}
