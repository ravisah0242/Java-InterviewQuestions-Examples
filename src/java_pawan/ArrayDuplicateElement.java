package java_pawan;

public class ArrayDuplicateElement {

	public static void main(String[] args) {
		
		String[] names= {"java","c++","java","Python", "Ruby"};
		
		for(int i=0; i<names.length; i++)
		{
			
			for(int j=i+1; j<names.length; j++)
			{
				/*if(names[i]==names[j])
					
				{
					System.out.println("Duplicate Element are :--->"+names[i]);
				}*/
				
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element are :--->"+names[i]);
				}
			}
		}
		
		
		
		
		
		

	}

}
