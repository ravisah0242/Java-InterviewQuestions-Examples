package Ravi;

public class WorldReverce 
{

	public static void main(String[] args) 
	{
		String str="this is string";
		String splitArray[]=str.split("  ");
		
		for(int i=splitArray.length-1; i>=0; i--)
		{
			System.out.print(splitArray[i]);
		}

	}

}
