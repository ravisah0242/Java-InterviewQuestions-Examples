package zp;

import java.util.HashSet;
import java.util.Set;

public class DuplivateElementInInteger {

	public static void main(String[] args) {


		Integer[] numbers= {123,413,444,555,444,6661,666};
		
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				if(numbers[i].equals(numbers[j]))
				{
					System.out.println("duplicate Number are:--> "+ numbers[i]);
				}
			}
		}
		
		Set<Integer> store=new HashSet<Integer>();
		for(Integer num:numbers)
		{
			if(store.add(num)== false)
			{
				System.out.println("duplicat Element "+num);
			}
		}

	}

}
