package java_pawan;

public class ReverseString {

	public static void main(String[] args) {


		/*String s="Ravi"; 	// 1  Way Reverse String // 5 way 
		String rev="";
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);*/
		
		/*String s="Ravi";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}*/
		
		String s="Ravi Ranjan";
		String[] w = s.split("");
		for(int i=w.length-1; i>=0; i--)
		{
			System.out.print(w[i]);
		}
		
		
		
		/*String s="Ravi Ranjan";		// 2 Way Reverse String
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);*/
		
	/*	String s="Ravi Kumar";			// 2 Way Reverse String
		StringBuilder sbl=new StringBuilder(s);
		//sbl.append(s);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);*/
		

	}

}
