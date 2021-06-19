package Tricky;

import java.util.Arrays;

public class SpliteMethod {

	public static void main(String[] args) {
		
		
		String s="123abc@#";
		String[] ch = s.split("");
		
		System.out.println(Arrays.toString(ch));
		
		for(String s1:ch)
		{
			System.out.println(s1);
		}
		

	}

}
