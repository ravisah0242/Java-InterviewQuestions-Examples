package javaGromingSauravSir;

public class StringPractice {

	public static void main(String[] args) {
		
		// 1. Using StringBuffer Rediment Method;
		System.out.println("=========// 1. Using StringBuffer Rediment Method;======================");
		String s="Mahabharat";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		// 2. with out Rediment method;
		System.out.println("========// 2. with out Rediment method;=====================");
		String s1="Ravi Ranjan";
		String rev="";
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		
		// 3. with out Rediment method
		System.out.println("=================// 3. with out Rediment method===========================");
		
		String s2="Vikash";
		char[] ch=s2.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
				
	}

}
