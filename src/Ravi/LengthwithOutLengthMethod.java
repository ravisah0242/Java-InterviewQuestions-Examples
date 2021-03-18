package Ravi;

public class LengthwithOutLengthMethod {

	public static void main(String[] args) {
		
		String name="Ravi Ranjan Kumar";
		char[] ch=name.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		System.out.println(count);
		
		String R="Ravi Ranjan";
		String[] s=R.split("");
		int count1=0;
		for(String s1:s)
		{
			count1++;
			
		}
		System.out.println(count1);
		
	}

}
