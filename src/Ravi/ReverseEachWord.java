package Ravi;

public class ReverseEachWord 
{

	public static void main(String[] args) 
	{
		String s="this is string";
		String[] str=s.split("  ");
		String revstr="";
		
		for(String w:str) 		// 1. Approach
		{
			String rev="";
			for(int i=w.length()-1; i>=0;i--)
			{
				rev=rev+w.charAt(i);
			}
			revstr=revstr+rev+" ";
		}
		System.out.println(revstr);
		
		/*for(int i=0; i<str.length; i++)			// 2. Approach
		{
			String word=str[i];
			String revword="";
			for(int j=word.length()-1; j>=0; j--)
			{
				revword=revword+word.charAt(j);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println(revstr);*/

	}

}
