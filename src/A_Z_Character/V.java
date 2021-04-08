package A_Z_Character;

class V{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==1&&i<4||j==5&&i<4||i==4&&j==2||
					i==4&&j==4||i==5&&j==3)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}