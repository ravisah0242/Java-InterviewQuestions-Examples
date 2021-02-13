package javaGromingSauravSir;

public class ReversStringWord {

	public static void main(String[] args) {
		
		// java Programming  Reverse each Word:
		
		String str="Java programing";
		String[] words = str.split(" ");
		String revString="";
		//String revword="";  		// when we used O/P not Match
		
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
