package javaProgramNVN;

public class StringOccurance {

	public static void main(String[] args) {

		// Print the occurrence of Character in the String---->
		String s="Ravi is going to Bangalore";
		char[] ch=s.toCharArray();
		int count=0;
		
		for(char ch1:ch) 
		{
			if(ch1=='a')
			{
				count++;
			}
		}
		System.out.println("occurrence of Character in an Array is "+count );
		
		System.out.println(s);
		System.out.println(s.lastIndexOf('a'));

	}

}
