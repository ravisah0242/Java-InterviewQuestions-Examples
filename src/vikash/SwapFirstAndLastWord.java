package vikash;

public class SwapFirstAndLastWord {
	
	// To swap first and last word present in a string

	
		public static void main(String[] args)	{
			String result="";
			String temp;
			String s="Happy New Year";
			String[] str=s.split(" ");
			temp=str[0];
			str[0]=str[2];
			str[2]=temp;
			for(String s1:str)
			{
				result+=s1+" ";
			}
			System.out.print("Swapped strins is==>>>"+ result);
			
		
	}


}
