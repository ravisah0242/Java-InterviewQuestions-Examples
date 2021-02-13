package java_pawan;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String s="Welcome to Java";
		String[] words=s.split(" ");
		String revstr="";
		
		for(String w:words)			// 1 . Approach
		{
			String revword="";
			for(int i=w.length()-1; i>=0; i--)
			{
				revword=revword+w.charAt(i);
			}
			revstr=revstr+revword+" ";
		}
		System.out.println(revstr);
		
				
		/*for(int i=0; i<words.length; i++)		// 2 . Approach
		{
			String word=words[i];
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
