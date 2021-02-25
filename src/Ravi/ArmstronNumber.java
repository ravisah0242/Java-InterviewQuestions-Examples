package Ravi;

public class ArmstronNumber {

	public static void main(String[] args) {
		
		int num=153;
		int t=num;
		int cube=0;
		int r;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube)
		{
			System.out.println(t+ " is Armston Number ");
		}
		else
		{
			System.out.println(t+" Not A Armstron Number ");
		}

	}

}
