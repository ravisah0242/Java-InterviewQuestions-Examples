package java_pawan;

import java.nio.IntBuffer;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		int num=123456;							// 1 Way Reverse Number
		int rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);

		/*											// 2. way using StringBuffer 
		int num=1234567;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		System.out.println(rev);*/
		
		/*int num=1234;								// 3. way using StringBuilder();
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println(rev);
		*/
	}

}
