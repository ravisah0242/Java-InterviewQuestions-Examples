package javaGromingSauravSir;

public class StringLength {

	public static void main(String[] args) {


		// 1. String find length without rediment method();
		String s="Vikash";
		int count=0;
		String[] str = s.split("");
		
		for(String str1:str)
		{
			count++;
		}
		System.out.println(count);
		
		
		// 2. String find length without rediment method();
		String s1="Mahabharat";
		char[] charArray = s1.toCharArray();
		int num=0;
		
		for(char ch:charArray)
		{
			num++;
		}
		System.out.println(num);
		
		// Remove Space from String
		String s2="V I K S H";
		String s3 = s.replaceAll(" ", "");
		System.out.println(s3);
		
		
		
	}
}
