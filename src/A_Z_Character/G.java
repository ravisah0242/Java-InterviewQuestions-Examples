package A_Z_Character;

class G{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1&&j>1&&j<=5||i==5&&j>1&&j<=5||
					j==1&&i>1&&i<5||j==5&&i>2||i==3&&j>3)
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