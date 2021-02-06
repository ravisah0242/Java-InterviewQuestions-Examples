package javaGromingSauravSir;

public class StringReverseeachWord {

	public static void main(String[] args) {
		
		// java Programming  Reverse each Word:
		
		String str="Java programing";
		String[] words = str.split(" ");
		String revString="";
		
		for(int i=0; i<words.length; i++)
		{
			String word=words[i];
			String revword="";
			
			for(int j=word.length()-1; j>=0; j--)
			{
				revword=revword+word.charAt(j);
			}
			revString=revString+revword+" ";
		}
		System.out.println(revString);
		

	}

}
