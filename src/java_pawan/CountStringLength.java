package java_pawan;

public class CountStringLength {

	public static void main(String[] args) {
		
		// String length conut with out length method
		String s="Ravi Ranjan";
		char[] ch=s.toCharArray();
		int count=0;
		
		for(char c:ch)
		{
			count++;
		}
		System.out.println(count);
		
		// String length conut with out length method
		String name="Vikash";
		String[] str=name.split("");
		int numcount=0;
		for(String str1:str)
		{
			numcount++;
		}
		System.out.println(numcount);
		
		// String words conut with out length method
		String names="Ravi Ranjan Kumar";
		String[] w=names.split(" ");
		int wcount=0;
		for(String st:w)
		{
			wcount++;
		}
		System.out.println(wcount);
		

	}

}
