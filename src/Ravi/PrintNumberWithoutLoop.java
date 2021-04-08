package Ravi;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	
			// 1. Recursive function
			// 2. java Streams 
	
	public static void main(String[] args) { 
	
		//printnum(1);
		//printnumber(20, 51);
		IntStream.range(1, 101).forEach(e -> System.out.println(e)); 
	}
	
	
	public static void printnum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printnum(num);
		}
	}
	
	public static void printnumber(int stnum, int endnum)
	{
		if(stnum<=endnum)
		{
			System.out.println(stnum);
			stnum++;
			printnumber(stnum, endnum);
		}
	}

}
