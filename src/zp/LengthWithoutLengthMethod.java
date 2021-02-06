package zp;

public class LengthWithoutLengthMethod {

	public static void main(String[] args) {

		String s="Ravi Ranjan";
		char[] ch = s.toCharArray();
		int count=0;
		
		for(char ch1:ch)
		{
			count++;
		}
		System.out.println(count);
		
		// 2 Way to count the length of String
		
		String v="Vikass";
		String[] str = v.split("");
		int count1 = 0;
				
		for(String str1:str)
		{
			count1++;
		}
		System.out.println(count1);
	}

}
