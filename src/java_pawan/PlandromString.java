package java_pawan;

public class PlandromString {

	public static void main(String[] args) {

		String s="Madam";
		String org=s;
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(s+":: Reverse---> "+rev);
		
		if(org.equalsIgnoreCase(rev))
		{
			System.out.println(org+"--> This is Plandrom String");
		}
		else
		{
			System.out.println(org+"--> This is not a Plandrom String");
		}

	}

}

