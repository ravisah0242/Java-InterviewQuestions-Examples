package Tricky;

public class EvenStringReverse {

	public static void main(String[] args) {
		
		String s="java is a programing language";
		String[] str=s.split(" ");
		String revstr="";
		int temp=0;
		for(int i=0; i<str.length; i++)
		{
			String w=str[i];
			String rev="";
			if(i%2!=0)
			{
				for(int j=w.length()-1; j>=0; j--)
				{
					rev=rev+w.charAt(j);
				}
			}
			revstr=revstr+rev+" ";
		}
		
		System.out.println(revstr);
		
		
		

	}

}
