package Ravi;

public class OccuranceCountWord {

	public static void main(String[] args) {
		
		String s="Ravi Ranjan Kumar";
		String[] w=s.split(" ");
		int count=0;
		
		for(String n:w)
		{
			count++;
		}
		System.out.println(count);
		

	}

}
