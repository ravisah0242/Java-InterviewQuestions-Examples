package javaProgramNVN;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		
		ArrayList<String> tvSerise=new ArrayList<String>();
		tvSerise.add("Game of thrones");
		tvSerise.add("Banking Bank");
		tvSerise.add("The big bang Theory");
		tvSerise.add("The Walking Dead");
		tvSerise.add("preson Break");
		
		// 1. using java 8 with for each loop and lambda expression in java 8 --->
				
		System.out.println("************ #.1 Using for each loop with lambda expression in java 8 ************ ");
		tvSerise.forEach(show-> {
			System.out.println(show); // ArrayList<String> tvSerise=new ArrayList<String>();
		});
		// 2. using Iterator --->
		System.out.println("************ #.2  Print using Iterator   ************ ");
		
		Iterator<String> it = tvSerise.iterator();
		while(it.hasNext())
		{
			String show = it.next();
			System.out.println(show);
		}
		// 3. using iterator and java 8 forEachRemaining() Method -->
		System.out.println("************** #.3-->  Print using iterator and java 8 forEachRemaining()  ************ ");
		it=tvSerise.iterator();
		it.forEachRemaining(show->{
			System.out.println(show);
		});
		// 4. Using for Each loop -->
		System.out.println("*************** #.4-->Using for Each loop   ********");
		for(String show1:tvSerise)
		{
			System.out.println(show1);
		}
		// 5. Using for loop with order/index ---->
		System.out.println("*************** #.5 Print Using for loop with order/index************");
		for(int i=0; i<tvSerise.size(); i++)
		{
			System.out.println(tvSerise.get(i));
		}
		// 6. Using a List Iterator() to Traverse in both the direction -->
		System.out.println("*************** #.6 Using a List Iterator() to Traverse in both the direction************");
		ListIterator<String> tvSeriselistIterator = tvSerise.listIterator(tvSerise.size());
		while(tvSeriselistIterator.hasPrevious())
		{
			String show2 = tvSeriselistIterator.previous();
			System.out.println(show2);
		}		
	}

}
