package JavaSessions;

public class FunctionsInJava {

	// functions:
	// can not create a function inside a function
	// function is the behavior of the class

	// 1. no input and no return:
	// void - can not return anything..can not have return keyword
	// return type: void
	public void test() {// 0 param function
		System.out.println("test function");
	}

	// 2. no input and some return:
	// return type: String
	public String getTrainerName() {
		System.out.println("get trainer name ");
		String name = "Naveen";
		return name;
	}

	// return type: int
	public int getTotal() {
		System.out.println("get total");
		int a = 100;
		int b = 200;
		int c = a + b + 30;
		return c;
	}

	// 3. some input and some return:
	public int add(int a, int b) {
		System.out.println("add function");
		int z = a + b;
		return z;
	}

	// Function - which takes country name as a param and returns capital name
	public String getCapitalName(String countryName) {

		System.out.println("getting the capital for " + countryName);

		if (countryName.equals("India")) {
			return "New Delhi";
		} else if (countryName.equals("USA")) {
			return "Washington DC";
		} else if (countryName.equals("Russia")) {
			return "Moscow";
		} else if (countryName.equals("UK")) {
			return "London";
		}

		else {
			System.out.println("Country name is not found, please pass the right country name " + countryName);
			return null;
		}

	}

	// function: which takes studentName(String) and return their marks(int):

	public int getStudentMarks(String studentName) {

		System.out.println("getting marks for student: " + studentName);

		int marks = 0;

		if (studentName.equals("Suma")) {
			marks = 90 + 10 - 5;
		}

		else if (studentName.equals("Vishal")) {
			marks = 100;
		}

		else if (studentName.equals("Jasvir")) {
			marks = 95;
		}

		else if (studentName.equals("Naveen")) {
			marks = 20;
		}

		else {
			System.out.println("student not found: " + studentName);
			marks = -1;
		}

		return marks;

	}

	// function: which takes browsername(String) and launches the browser
	// accordingly:
	// return type: void

	public void launchBrowser(String brName) {

		if (brName.equals("chrome")) {
			System.out.println("chrome launched");
		} else if (brName.equals("firefox")) {
			System.out.println("FF launched");
		} else {
			System.out.println("browser not found " + brName);
		}
	}

	public static void main(String ar[]) {

		FunctionsInJava obj = new FunctionsInJava();

		obj.test();
		String n = obj.getTrainerName();
		System.out.println(n);

		int total = obj.getTotal();
		System.out.println(total + 10);

		System.out.println(obj.getTotal());

		int t1 = obj.add(10, 20);
		System.out.println(t1);

		int t2 = obj.add(30, 40);
		System.out.println(t2);

		String cap1 = obj.getCapitalName("Germany");
		System.out.println(cap1);

		int m1 = obj.getStudentMarks("Peter");
		System.out.println(m1);

		obj.launchBrowser("chrome");

	}

}