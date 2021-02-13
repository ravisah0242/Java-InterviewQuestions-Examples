package java_pawan;

public class OccuranceCountWords {

	public static void main(String[] args) {
		
		
		String s="Welcome to java";
		int count=1;
		
		for(int i=0; i<s.length(); i++)
		{
			if((s.charAt(i)==' ') &&(s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		
		System.out.println("Number of Words in String ::-->"+count);

	}

}
