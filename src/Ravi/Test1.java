package Ravi;

import java.util.stream.IntStream;

public class Test1 {

	
		public static void main(String[] args) {
			
			//printNumberWithoutLoop(1);
				//printNumber(50, 60);
			IntStream.range(1, 20).forEach(e -> System.out.println(e));
			
		}
		
		
		public static void printNumberWithoutLoop(int num)
		{
			if(num<=20)
			{
				System.out.println(num);
				num++;
				printNumberWithoutLoop(num);
			}
		}
	
		public static void printNumber(int strnum,int endnun)
		{
			if(strnum<=endnun)
			{
				System.out.println(strnum);
				strnum++;
				printNumber(strnum, endnun);
			}
		}

}
