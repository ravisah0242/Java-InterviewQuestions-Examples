package list_Interface;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {

		// LinkList store the data base on Node: ( 1.Singly LinkList  2. .......);
		// LinkList non Synchronized (its fast as compare to other collection like HashTabel & Vector because it is Synchronized )
		// LinkList is a Class Implements List Interface;
		// Maintains insertion order
		// Can contains duplicate value/Element
		// Random data Access not Allows
		// Null Element are Allow
		// not store data in key-values paire
		// FIFO ---> First in First out
		
		
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("Java");
		ll.add("Ruby");
		for(int i=0; i<ll.size(); i++)
		{
			 System.out.println(ll.get(i));
		}
		System.out.println("********************************");
		
		// Print 
		System.out.println(ll);
		System.out.println("Sizs of element "+ll.size());
		System.out.println("2 nd index element :-->"+ll.get(2));
		System.out.println("First element is:--> "+ll.getFirst());
		System.out.println("to String is: --> "+ll.toString());
		System.out.println("Last Element is :--> "+ll.getLast());
		System.out.println("**************add First and last then bw Remove some element*************");
		
		// Add First Element :
		ll.addFirst("Automation");
		
		// Add Last Element Element:
		ll.addLast("Dev");
		
		for(int i=0; i<ll.size(); i++)
		{
			 System.out.println(ll.get(i));
		}
		
		// Remove from index 1;
		System.out.println("*************  Remove index 1 then *******************");
		ll.remove(1);
		System.out.println(ll);
		
		System.out.println("***********Remove first element************");
		// Remove first element
		ll.removeFirst();
		System.out.println(ll);
		
		System.out.println("************Remove Last element **************");
		// Remove last element
		ll.removeLast();
		System.out.println(ll);
		
		// how to print all the value of  LinkList :--->
		// 1. for loop:--->
		// 2.Advance For Loop:--->
		// 3.iterator :--->
		// 4.while loop:---->
		
		System.out.println();
		System.out.println("*******  1. Using for loop:--->**********");
		
		// 1. for loop:--->
		for(int i=0; i<ll.size(); i++)
		{
			 System.out.println(ll.get(i));
		}
		
		// 2.Advance For Loop:--->
		System.out.println("*******  2. Using  dvance For Loop:--->**********");
		for(String s:ll)
		{
			System.out.println(s);
		}
		
		// 3.iterator :--->
		System.out.println("*******  3. Using iterator :--->**********");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// 4.while loop:---->
		System.out.println("*******  4. Using  while loop:----> **********");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
	}

}
