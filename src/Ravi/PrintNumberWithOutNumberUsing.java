package Ravi;

public class PrintNumberWithOutNumberUsing {

	public static void main(String[] args) {
		
		// 1 Approach
		int one='A'/'A';
		String s="..........";
		
		for(int i=one; i<=(s.length()*s.length()); i++)
		{
			System.out.println(i);
		}
		
		// 2 Approach
		for(int i=one; i<='d'; i++)
		{
			System.out.println(i);
		}
		
		
		int num=1;
		
		while(num<=10)
		{
			System.out.println(num++);
		}
		
		

	}

}
