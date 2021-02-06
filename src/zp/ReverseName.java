package zp;

public class ReverseName {

	public static void main(String[] args) {


		String name="Ravi Ranjan";
		char[] ch = name.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		
		
		System.out.println("*****************************");
		String s="Ravi";
		String rev="";
		int leng;
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
