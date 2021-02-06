package javaProgramNVN;

public class StringManupulations {

	public static void main(String[] args) {


		String s="The rain have Started hare";
		String s1="The Rain have Stop Hare";
		String s2="the rain have started hare";
		
		System.out.println(s.length());				// 26
		
		System.out.println(s1.charAt(4)); 			// R
		
		System.out.println(s1.indexOf('R'));		// 4 (First Occurrence)

		System.out.println(s.indexOf('R'));			// -1 Because R not present in s="The rain have Started hare"
	
		System.out.println(s.indexOf('h'));			// 	1
		
		System.out.println(s.indexOf('h',s.indexOf('h')+1));		// 9 (Second Occurrence)
		
		System.out.println(s.indexOf("Have"));			// -1
		
		System.out.println(s.indexOf("have"));			// 9
		
		// String Comparison
		System.out.println(s.equals(s2));			// false
		
		System.out.println(s.equalsIgnoreCase(s2));		// true
		
		// SubString 
		System.out.println(s.substring(0));			//  The rain have Started hare

		System.out.println(s.substring(0, 9)); 		// The rain 
		
		// Trim
		String s3="    Hello Word    ";
		System.out.println(s3.trim()); 	// (Hello Word)   Remove before and After Space
		
		System.out.println(s3.replaceAll(" ", "")); 	// Replace Space 
		 
		String date="03-02-2021";
		
		System.out.println(date.replaceAll("-", "/")); 	// 03/02/2021
		
		// Split 
		String test="Hello_World_Testing_Selenium";
		String[] t = test.split("_");
		
		for(int i=0; i<t.length; i++) {
			System.out.println(t[i]); 		// Hello World Testing Selenium
		}
		
		// Concatenate
		String test1="Ravi";
		System.out.println(test1.concat("R"));	// RaviR
		
		String x="java";
		String y="Selenium";
		int a=6;
		int b=5;
		System.out.println(x+y);		// javaSelenium
		System.out.println(a+b+x);		//11java
		System.out.println(x+a+b);		// java65
		
		System.out.println(x+(a+b));	// java11
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
	}

}
