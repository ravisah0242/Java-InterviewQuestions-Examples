package vikash;

public class DuplicateCharaterInString {
	
	//To print only duplicate charcter in a string

	public static void main(String[] args){
		//String str="tindiai";	//-------------------> iii
		String str="tindia";  //---------------------> i
		
		for(int i=0;i<str.length();i++)
		{
	            for(int j=i+1;j<str.length();j++)
	            {
	            	if(str.charAt(i)==str.charAt(j))
	            	{
	            		System.out.print(str.charAt(j));
	            	}
	            }
		}
		
		String name="RaviRanjan";
		for(int i=0; i<name.length(); i++)
		{
			for(int j=i+1; j<name.length(); j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println(name.charAt(i));
				}
			}
		}
		
		
		
		
		
		
	}
}
