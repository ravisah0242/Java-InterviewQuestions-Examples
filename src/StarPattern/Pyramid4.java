package StarPattern;

class Pyramid4{
	public static void main(String[] args) {
		for(int i=1; i<=7; i++)
		{
			for(int j=7; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<(i*2); k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}