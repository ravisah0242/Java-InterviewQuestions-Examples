package vikash;

import java.util.ArrayList;

public class ArrayListDuplicateElement {
	
	//To print duplicate present inside arraylist

	
		public static void main(String[] args){
			ArrayList list= new ArrayList();
			list.add(0);
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(2);
			list.add(1);

			for(int i=0;i<list.size()-1;i++)
	        {
	            for(int j=i+1;j<list.size();j++)

	            {
	            	if(list.get(i)==list.get(j))
	            	{
	            		System.out.print(list.get(j));
	            	}
	            }
	        }
	}
	

}
