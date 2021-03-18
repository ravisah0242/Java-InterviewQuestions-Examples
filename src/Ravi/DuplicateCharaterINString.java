package Ravi;

public class DuplicateCharaterINString {

	public static void main(String[] args) {
		
		String name="RaviRanjan";
		
		for(int i=0;i<name.length(); i++)
		{
			for(int j=i+1; j<name.length(); j++)
			{
				if(name.charAt(i)==name.charAt(j))
				{
					System.out.println(name.charAt(j));
				}
			}
		}
		
	}

}
