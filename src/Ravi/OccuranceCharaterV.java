package Ravi;

public class OccuranceCharaterV {

	public static void main(String[] args) {
		
		String s="Viakasa is good an cute bhacha";
		char[] ch=s.toCharArray();
		int count=0;
		
		for(char c:ch)
		{
			if(c=='a')
			{
				count++;
			}
		}
		System.out.println("count a in given string ::->> "+count);

	}

}
