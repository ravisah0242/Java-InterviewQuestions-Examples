package np;

public class StringOccurance {

	public static void main(String[] args) {
		
		String str="I Love Coding and testing";
		
		int count=0;
		
		for(char ch:str.toCharArray())
		{
			if(ch=='t')
			{
				count++;
			}
			
		}
		System.out.println("Value :- "+count);
		
		
		
		
		
		
	}

}
