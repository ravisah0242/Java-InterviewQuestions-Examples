package JavaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {

		//Arraylist -- Integer type
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		marks.add(100);
		marks.add(200);
		marks.add(300);
		marks.add(400);

		System.out.println(marks.size());
		
		for(Integer e : marks) {
			System.out.println(e);
		}
		
		System.out.println("---------");
		//JDK 8 streams: with lambda
		marks.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("---------");

		ArrayList<String> empList = new ArrayList<String>();
		empList.add("Tom");
		empList.add("Peter");
		empList.add("Lisa");
		
		System.out.println(empList.size());
		
		for(String e : empList) {
			System.out.println(e);
		}
		
		System.out.println("---------");

		empList.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("---------");

		
		//Create an Ararylist which stores an emp details:
		
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Tom");
		empData.add(25);
		empData.add(34.55);
		empData.add('m');
		empData.add(true);
		
		System.out.println(empData.size());
		
		for(Object e : empData) {
			System.out.println(e);
		}
		
		
		
		
	}

}