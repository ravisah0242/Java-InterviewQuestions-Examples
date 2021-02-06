package javaProgramNVN;

public class ReverseString {

	public static void main(String[] args) {
		
		// 1. Simple for loop using String Reverse :---->
		System.out.println("***************Simple for loop using String Reverse****************");
		String s="Ravi Ranjan";
		int leng=s.length();
		String rev="";
		for(int i=leng-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		// 2.Reverse Using with out Rudiment Method():--->
		System.out.println("\n***************** Using with out Rudiment Method():--->****************");
		String v="Vikash";
		char[]ch=v.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		
		
		// 3. Reverse Usuing string Buffer Calss to Reverse String :---->  
		System.out.println("\n*****\n*****Using String Buffer Class to Reverse String ****************");
		String m="Mahabgarat";
		StringBuffer sb=new StringBuffer(m);
		System.out.println(sb.reverse());
		
		
		
	}

}
