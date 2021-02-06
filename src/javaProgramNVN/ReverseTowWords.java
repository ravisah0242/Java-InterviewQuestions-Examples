package javaProgramNVN;

public class ReverseTowWords {

	public static void main(String[] args) {

		// Two Word to Reverse using spite Method()----> 
			System.out.println(" \n***********Two Word to Reverse using spite Method() ***************");
			String str="Java Program";
			// [Java Program]
			String [] words=str.split(" ");		
			String revstr="";
			for(int i=0; i<words.length; i++)
			{
				String word=words[i];
				String revword="";
				for(int j=word.length()-1; j>=0; j--)
					{
						revword=revword+word.charAt(j);	//Java
					}
					revstr=revstr+revword+" ";		// Java Programing
			}
			System.out.println(revstr);

	}

}
