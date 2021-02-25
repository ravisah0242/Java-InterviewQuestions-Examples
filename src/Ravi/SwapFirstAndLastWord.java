package Ravi;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
		
		String str="Happy New Year";
		String[] s=str.split(" ");
		String result="";
		String temp;
		
		temp=s[0];
		s[0]=s[2];
		s[2]=temp;
		
		for(String s1:s)
		{
			result+=s1+" ";
		}

		System.out.println(result);
	}

}
