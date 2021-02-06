package list_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static <E> void main(String[] args) {
		
		// Default Class
		// 1) Static Array --> its fixed;
		// 2) Dynamic Array --> Can not be fixed (its Vary).
		 
		// Implicants List Interface
		// Maintains insertion order
		// Can contains duplicate value/Element
		// its non Synchronized (its Fast as compare to other collection like HashTabel & Vector because its Synchronized)
		// Random data Access to Allows to fetch the element because it store the value on basic of index
		// not store data in key-values pair
		// Null Element are Allow
		// FIFO ---> First in First out
		
		
		
		/*int[] i=new int[4];	// Static Array its fixed;			
		i[0]=100;
		i[2]=12;
		//i[4]=200;
		i[-1]=45;
		System.out.println(i[0]); 	// 100;
		System.out.println(i[3]);	// 0;
		System.out.println(i[2]);
		//System.out.println(i[4]);	// Null pointer exception;
		System.out.println(i[-1]);*/
		
		//Default generic 
		// Dynamic Array
		ArrayList ar=new ArrayList();   //Dynamic Array // non generic ArrayList:-->
		ar.add(20);
		ar.add(27);
		ar.add(23);
		ar.add("Ravi");
		ar.add('M');
		ar.add(true);
		//System.out.println(ar.size());
		System.out.println(ar);
		ar.add(244);
		ar.add(20);
		ar.add(222);
		System.out.println(ar);
		
		ArrayList<Object> arr=new ArrayList<Object>(); //ArrayList Store the data base on index;
		arr.add(22); 			// 1 st Position
		arr.add("Testing");		// 2 st Position
		arr.add('M');			// 3 st Position
		arr.add(true);			// 4 st Position
		arr.add(22.33);			// 5 st Position
		System.out.println(arr);
		System.out.println(arr.get(2));
		//System.out.println(arr.get(6)); 	// Out of Bound Exception
		//System.out.println(arr.get(-1));	// Out of Bound Exception
		
		System.out.println(arr.size());
		
		System.out.println("Loest index = "+ 0);
		System.out.println("Higest index = "+ (arr.size()-1));
		
		// to print all the value From ArrayList;
		// 1. for each loop;
		// 2. using iterator
		for(int i=0; i<arr.size();i++)
		{
			 System.out.println(arr.get(i));
		}
		
		// non generic vs generic: 
		
		ArrayList<Integer> ar1 =new ArrayList<Integer>();	// generic: --->
		ar1.add(100);
		ar1.add(200);
		ar1.add(300);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Java");
		ar2.add("Python");
		ar2.add("C#");
		
		ArrayList<E> ar3=new ArrayList<E>();
		/*ar3.add((E) "SElenium");
		ar3.add('s', null);
		ar3.add(400, null);
		System.out.println(ar3);*/
		
		//Employee Class Object :-->
		Employee e1=new Employee("Ravi", "Automation", 25);
		Employee e2=new Employee("Naveen", "Manual", 27);
		Employee e3=new Employee("Pushkar", "SQL", 25);
		
		// Create ArrayList:
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		System.out.println("*********  Using Iterator   ****************");
		
		// iterator to traverse values: 
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.dept);
			System.out.println(emp.age);
		}
		
		System.out.println("*********  Using Add All Method   ****************");
		 
		// Add All Method:--->
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("java");
		ar5.add("Selenium");
		ar5.add("Ruby");
		
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("Test");
		ar6.add("dev");
		ar6.add("QA");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//Remove All Method:--->
		System.out.println("*********  Using Remove All method   ****************");
		ar5.removeAll(ar6);
		for(int i=0; i<ar5.size(); i++)
		{
			System.out.println(ar5.get(i));
		}
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("Ravi");
		ar7.add("Ranjan");
		ar7.add("Kumar");
		
		// Remove base on index:--->
		System.out.println("*********  Using Remove From index   ****************");
		ar7.remove(2); 
		for(int i=0; i<ar7.size(); i++)
		{
			System.out.println(ar7.get(i));
		}
		
		System.out.println("*********  Using Retains Method   ****************");
		ArrayList<String> ar8 =new ArrayList<String>();
		ar8.add("QTP");
		ar8.add("FTP");
		ar8.add("TCP");
		
		ArrayList<String> ar9=new ArrayList<String>();
		ar9.add("DHCP");
		ar9.add("SMTP");
		ar9.add("FTP");
		
		// Filter the common :--->
		ar8.retainAll(ar9);            
		for(int i=0; i<ar8.size(); i++)
		{
			System.out.println(ar8.get(i));
		}
		
		//ArrayList<Integer, String> ar8=new ArrayList<Integer,String >();
		
		
		
		
		
		//ar5.retainAll(c)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
