package Ravi;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Character> c=new PriorityQueue<Character>();
		c.add('A');
		c.add('B');
		c.add('C');
		System.out.println(c);
		

		//System.out.println(c.remove()); //A
		//System.out.println(c); //[B, C, C]


		System.out.println(c.poll()); //A
		System.out.println(c); //[B, C, C]


		/*Iterator itr=c.iterator();

				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}*/

		/*for(Object ele:c)
		{
			System.out.println(ele);
		}*/
				
	}

}
