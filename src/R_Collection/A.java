package R_Collection;

public class A {

	public static void main(String[] args) {

		int[]  s= {1,2,3,4,5,6,7,7,6};		
		
		for(int i=0; i<s.length; i++)
		{
			for(int j=i+1; j<s.length; j++)
			{
				if(s[i]==(s[j]))
				{
					System.out.print(+s[j]+",");
				}
			}
		}
		
	}

}
