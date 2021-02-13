package zp;

public class ReverseName {

	public static void main(String[] args) {

		// 1. Approach 
		String name="Vikash";
		char[] ch = name.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		
		// 3. Approch
		
		String r="Ranjan";
		String[] r1=r.split("");
		
		for(int i=r1.length-1; i>=0; i--)
		{
			System.out.print(r1[i]);
		}
		System.out.println();
		
		// 2. Approch 
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
