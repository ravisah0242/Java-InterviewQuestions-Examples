package zz;

public class Test1
{
	public static void main(String[] args) 
	{
		
		String s="Himalaya";
		char[] ch=s.toCharArray();
		int count=0;
		for(char ch1:ch)
		{
			if(ch1=='a'|ch1=='e'|ch1=='i'|ch1=='o'|ch1=='u')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
