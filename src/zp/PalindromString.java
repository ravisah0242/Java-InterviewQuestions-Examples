package zp;

public class PalindromString {

	public static void main(String[] args) {
		
		String s="madam";
		String org=s;
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse String is --> "+rev);
		
		if(org.equals(rev))
		{
			System.out.println(rev+" This is a Palindrom String");
		}
		else
		{
			System.out.println(rev+" This is not A Palindrom String");
		}
	}

}
