package javaProgramNVN;

public class ArmstrongNumberNVN {

	// 1*1*1=1, // 5*5*5=125, // 3*3*3=27, // 407 == 4*4*4 + 0 + 7*7*7 =407,// 0, // 1, //370, 371
	public static void isArmsTroneNumber() {

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
				System.out.println(t+" --> this is Armstrone Number");
			}
			else {
				System.out.println(t+" -->  Not a Armstrone Number");
			}
	}	
			
	public static void main(String[] args) {

		//isArmsTroneNumber(153);
		isArmsTroneNumber();
	}

}
