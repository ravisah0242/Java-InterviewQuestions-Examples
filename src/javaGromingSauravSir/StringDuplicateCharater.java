package javaGromingSauravSir;

public class StringDuplicateCharater {
	
	public static void main(String[] args)	{
		
		String str="tindia vikash";
		for(int i=0;i<str.length()-1;i++)
	        {
			for(int j=i+1;j<str.length();j++)
	            {
	            if(str.charAt(i)==str.charAt(j))
	            	{
	                	System.out.print(str.charAt(j));
	            	}
	            }
	        }
	}
}
