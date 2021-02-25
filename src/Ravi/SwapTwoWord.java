package Ravi;

public class SwapTwoWord {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="word";
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a+b);

		
		String str="Hello World";
		String[] s=str.split(" ");
		String result="";
		String temp;
		
		temp=s[0];
		s[0]=s[1];
		s[1]=temp;
		for(String s1:s)
		{
			result+=s1+" ";
		}
		
		System.out.println(result);
	}

}
