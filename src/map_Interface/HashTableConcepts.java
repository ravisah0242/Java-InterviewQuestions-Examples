package map_Interface;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcepts {

	public static void main(String[] args) {
		
		// HashTable is a class its Implements Map Interface;
		// it is similar to HashMap but it is Synchronized
				// extracts abstractMap 
		// it Contains only unique elements
		// key --> Object -- HashCode --> Value
		// Store the values - Key -value pare
		// Null key and Null Value are not Allows
		// HashTable Synchronized --->  thread safe. 
				//(its Slow as compare to other collection because it is Synchronized )
		// Not Maintains insertion order (don't store base on index);
		// Random data Access Allows
		// Duplicate Element are not Allows
		// FILO ---> First in Last out
		
		Hashtable h1=new Hashtable();
		h1.put(1, "Test1");
		h1.put(2,"peter");
		h1.put(3, "Jonny");
		System.out.println(h1);  	// FILO --> First in Last Out;
		
		//Remove Element from Hashtable
		h1.remove(1);
		System.out.println(h1);  
		
		// Clone or Copy data from h1 to h2
		Hashtable h2=new Hashtable();		
		h2=(Hashtable)h1.clone();
		System.out.println(h2);
		
		System.out.println("The Value from h1 --> "+ h1);
		System.out.println("The Value from h2 --> "+ h2);
		
		//Clean data From h1
		h1.clear();
		
		System.out.println("The Value from h1 --> "+ h1);
		System.out.println("The Value from h2 --> "+ h2);
		
		// Contains value
		//Hashtable<Integer, String> h3 = new Hashtable<Integer, String>();
		Hashtable h3=new Hashtable();
		h3.put(1, "Java");
		h3.put(2, "Selenium");
		h3.put(3, "Ruby");
		h3.put(4, "C#");
		
		// Contains Method
		if(h3.containsValue("Selenium"))			//Value is Case Sensitive
		{
			System.out.println("Value is found :: for 'selenium' Value is Case Sensitive");
		}
		if(h3.contains("Java"))		//Value is Case Sensitive
		{
			System.out.println("Value is found---> But 'Java' Value is Case Sensitive ");
		}
		
		// Print the all Value from HashTable using Enumeration
		
		Enumeration e = h3.elements();
		System.out.println("***********Print the Value of h3 HashTable using Enumeration  **********");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("********  HashTabe Print ^ FiLO Element*********");
		
		// print all the value of HashTable h3 using Entry set
		System.out.println();
		System.out.println("**********  print all the value of HashTable h3 using Entry set  **********");
		
		// print all the value of HashTable h3 using Entry set
		Set s = h3.entrySet();
		System.out.println(s);
		System.out.println();
		
		System.out.println("******** Check the HashTable are Equal or Not  ***********");
		System.out.println();
		
		// Generic 
		//Hashtable<Integer, String> h4 = new Hashtable<Integer, String>();
		
		
		//OR Non Generic
		Hashtable  h4 = new Hashtable();
		h4.put(1, "Java");
		h4.put(2, "Selenium");
		//h4.put(3, "Ruby");
		//h4.put(4, "C#");
		h4.put(4, "Ruby#");
		h4.put(3, "C#");
		
		// null key and Null Value ---> Gives - NullPointerException
		//h4.put(5, null);
		
		// Check the HashTable are Equal or Not
		if(h4.equals(h3))
		{
			System.out.println("Both are Equal");
		}
		else {
			System.out.println(" Both are not Equal");
		}
		
		// Get the Value From 1 Key
		System.out.println(" Get the Value From 1 Key---->"+h4.get(1));
		
		//Get the HashCode of HashTable Object::
		System.out.println("### Get the  Hash Code---> "+h4.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
