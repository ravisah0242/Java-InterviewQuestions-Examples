package Ravi;

public class OccuranceVowel {

	public static void main(String[] args) {
		
		String s="Himalaya";
		char[] ch=s.toCharArray();
		int count=0;
		
		for(char c:ch)
		{
			if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u')
			{
				count++;
			}
		}
		System.out.println("Occurance of Charter in Given String ::->> "+count);
		

	}

}
