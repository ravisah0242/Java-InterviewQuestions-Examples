package vikash;

public class ReverseString {
	
	//Reverse the string with out using redimate method


		public static void main(String[] args){
			String s="Vikas";
			char[] ch=s.toCharArray();

			for(int i=ch.length-1;i>=0;i--)
				{
				System.out.print(ch[i]);
				}
			
			System.out.println("******************************************");
			String ss="Ravi Ranjan";
			int len=ss.length();
			String rev="";
			for(int i=len-1; i>=0; i--)
			{
				rev=rev+ss.charAt(i);
			}
			System.out.println(rev);
	}


}
