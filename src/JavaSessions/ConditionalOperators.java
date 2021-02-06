package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 10;

		System.out.println(a > b);
		System.out.println(b > a);

		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}

		if (a == b) {
			System.out.println("both are equal");
		}

		if (false) {// Dead code
			System.out.println("Hey");
		} else {// Dead code
			System.out.println("Hello");
		}

		boolean flag = true;

		if (flag) {
			System.out.println("Selenium");
		} else {
			System.out.println("QTP");
		}

		// nested - if
		int marks = 101;
		if (marks <= 100) {
			if (marks >= 90) {
				System.out.println("GRADE A");
					
			}
			if (marks >= 80) {
				System.out.println("GRADE B");
			}
		} else {
			System.out.println("Not Eligible");
		}

		// if if if
		int score = 100;

		if (score >= 90) {
			System.out.println("GRADE A");

		}

		if (score >= 80) {
			System.out.println("GRADE B");

		}

		if (score >= 70) {
			System.out.println("GRADE C");

		}

		if (score >= 60) {
			System.out.println("GRADE D");

		}

		// if - if:
		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}

		if (browser.equals("firefox")) {
			System.out.println("launch ff");
		}

		if (browser.equals("IE")) {
			System.out.println("launch IE");
		}

		if (browser.equals("Safari")) {
			System.out.println("launch Safari");
		}

		else {
			System.out.println("please pass the correct browser name " + browser);
		}

		// if - else if:
		String br = "chrome";
		if (br.equals("chrome")) {
			System.out.println("launch chrome");
			
		}

		else if (br.equals("firefox")) {
			System.out.println("launch ff");
		}

		else if (br.equals("IE")) {
			System.out.println("launch IE");
		}

		else if (br.equals("Safari")) {
			System.out.println("launch Safari");
		}

		else {
			System.out.println("please pass the correct browser name " + br);
		}

	}

}