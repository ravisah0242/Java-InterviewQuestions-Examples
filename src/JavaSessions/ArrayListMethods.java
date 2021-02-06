package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class ArrayListMethods {

	public static void main(String[] args) {

		// ArrayList is not synchronized:
		// not thread-safe

		// Vector class : JDK 1.0 (legacy class)
		// synchronized

		Vector<String> empNAmes = new Vector<String>();
		empNAmes.add("test");

		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(10);
		ar.add(2);
		ar.add(40);
		ar.add(1);
		ar.add(45);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);

		ArrayList<Integer> marks = new ArrayList<Integer>();

		marks.add(100);
		marks.add(200);

		ar.addAll(marks);

		System.out.println(ar);

		List<Integer> ar1 = Collections.synchronizedList(ar);

	}

}