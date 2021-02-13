package zp;

import java.util.Arrays;

public class ArrayEqualORNot {

	public static void main(String[] args) {
		
		int[] num= {12,23,34,56,67,78,89};
		int[] num1= {12,23,34,56,67,78,89};
		boolean status=Arrays.equals(num, num1);
		if(status==true)
		{
			System.out.println("Both <<<<<<<Integer Array>>>>>> Are Eqals");
		}
		else 
		{
			System.out.println("Both <<<<<<<Integer Array>>>>>> are not equls");
		}

		String[] name= {"java","Ruby", "C++","Python","Java"};
		String[] name1={"java","Ruby", "C++","Python","Java"};
		boolean status1=Arrays.equals(name, name1);
		if(status1==true)
		{
			System.out.println("Both String Array Are Equals");
		}
		else
		{
			System.out.println("Both String Array are Not Equals");
		}
		

	}

}
