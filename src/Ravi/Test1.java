package Ravi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Test1 {

	public static void main(String[] args) {
		
		String s="Hello Word";
		String[] str=s.split(" ");
		String result="";
		String temp;
		
		temp=str[0];
		str[0]=str[1];
		str[1]=temp;
		
		for(String s1:str)
		{
			result+=s1+" ";
		}
		System.out.println(result);
		
		String a="Hello";
		String b="word";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		
		System.out.println(a+" ::: "+b);
		
		
		
		
		
		
		
		
		
		
		

	}

}
