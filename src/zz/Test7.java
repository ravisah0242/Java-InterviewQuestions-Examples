package zz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Random;

public class Test7 {

	public static void main(String[] args) {

		
		String s="Om prakesh Gautam";
		String[] word=s.split(" ");
		String strrev="";
		
		for(String w:word)
		{
			String rev="";
			for(int i=w.length()-1; i>=0; i--)
			{
				rev=rev+w.charAt(i);
			}
			strrev=strrev+rev+" ";
		}
		System.out.println(strrev);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
