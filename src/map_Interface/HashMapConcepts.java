package map_Interface;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {


		// Hash Map is a class its Implements Map Interface;
		// extracts abstractMap 
		// it Contains only unique elements 
		// Store the values - Key -value pare
		// it may have one null key and multiple null values
		// HashMap non Synchronized ---> not thread safe. 
		// Concurrent Modification Exception--> its fail-fast Condition JDK 1.6
		//(its Fast as compare to other collection like HashTabel & Vector because it is Synchronized )
		// Not Maintains insertion order (don't store base on index);
		// Random data Access Allows
		// Duplicate Element are not Allows
		// FIFO ---> First in First out
		
		HashMap hm1=new HashMap();
		hm1.put(1, "Test");
		hm1.put(2, "Test2");
		
		//System.out.println(hm1);
		
		HashMap<Integer, String> hm=new HashMap<Integer ,String>();
		hm.put(1, "Manual");
		hm.put(2, "Java");
		hm.put(3, "SQL");
		hm.put(4, "Selenium");
		hm.put(null, "RAna");
		hm.put(null, null);
		hm.put(null, null);
		
		
		
		//System.out.println(hm);
		//System.out.println(hm.get(1));
		//System.out.println(hm.get(4));
		//System.out.println(hm.get(5));		// there are no exception ---its gives null;
		//System.out.println(hm.get(6));		// there are no exception ---its gives null;
		
		for(Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" - "+m.getValue());
		}
		
		System.out.println("*******************************************");
		// remove Element From HashMap
		hm.remove(1);
		hm.remove(2, "Java");
		System.out.println(hm);
		
		
		HashMap<Integer, Employee> emp=new HashMap<Integer, Employee>();
		Employee e1=new Employee("Ravi", "QA", 25);
		Employee e2=new Employee("Ranjan", "DEV", 26);
		Employee e3=new Employee("Pushker", "Manual", 24);
		Employee e4=new Employee("Rohan", "Admin", 22);
		
		emp.put(1,  e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);
		//emp.put(5, null);			// NullPointerException
		//emp.put(6, null);  		// NullPointerException
		//emp.put(null, null); 		// NullPointerException
		//emp.put(null, null);		// NullPointerException
		
		// Remove Element from HashMap;
		emp.remove(2, e2);
				
		// Traverse the HashMap:------>>
		System.out.println("****** Traverse the HashMap:------>>  *****");
		for(Entry<Integer, Employee> m:emp.entrySet())
		{
			int key1 = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee "+ key1+ " Info");
			System.out.println(e.name+" - "+e.dept+" - "+e.age);
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
