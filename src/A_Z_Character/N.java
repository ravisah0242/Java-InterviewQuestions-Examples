package A_Z_Character;

class N{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==1||i==j||j==5)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}