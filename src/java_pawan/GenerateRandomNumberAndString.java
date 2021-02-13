package java_pawan;

import java.util.Random;

public class GenerateRandomNumberAndString {

	public static void main(String[] args) {

		// 1 Approach  Random Class
		Random rand=new Random();
		int value=rand.nextInt(10);
		System.out.println(value);
		
		double dvalue=rand.nextDouble();
		System.out.println(dvalue);
		
		// 2 Approach Math class but create an object this class
		
		System.out.println(Math.random());   		// gives us decimal number
		
		// 3 Approach Apache common API need to download and Add plugin
		
		//RandomString.
		

	}

}
 