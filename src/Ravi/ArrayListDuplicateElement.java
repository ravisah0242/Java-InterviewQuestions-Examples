package Ravi;

import java.util.ArrayList;

public class ArrayListDuplicateElement 
{
	public static void main(String[] args) {
		
		ArrayList<String > al=new ArrayList<String >();
		al.add("Ruby");
		al.add("java");
		al.add("C");
		al.add("C++");
		al.add("java");
		
		for(int i=0;i<al.size(); i++)
		{
			for(int j=i+1; j<al.size(); j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					System.out.println(al.get(j));
				}
			}
		}
		
		
		
	}

}
