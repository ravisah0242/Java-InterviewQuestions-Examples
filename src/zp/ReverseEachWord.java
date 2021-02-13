package zp;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String name="Ravi Ranjan Kumar";
		String[] str=name.split(" ");
		String revstr="";
		
		/*for(int i=0; i<str.length; i++)
		{
			String word=str[i];
			String rev="";
			for(int j=word.length()-1; j>=0; j--)
			{
				rev=rev+word.charAt(j);
			}
			revstr=revstr+rev+" ";
		}
		
		System.out.println(revstr);*/
		
		for(String w:str)
		{
			String revword="";
			for(int i=w.length()-1; i>=0; i--)
			{
				revword=revword+w.charAt(i);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println(revstr);

	}

}
