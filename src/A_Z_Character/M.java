package A_Z_Character;

class M{
	public static void main(String[] args) {
		for(int i=1;i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==1||j==5||i==2&&j>=2&&j<3||
					j==4&&i==2||i==3&&j>=3&&j<4)
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