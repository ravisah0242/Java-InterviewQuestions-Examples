package JavaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Hello World");

		main(10);
		main(10,20);
		
		
	}

	public static void main(int a) {
		System.out.println("Hello World " + a);

	}

	public static void main(int a, int b) {
		System.out.println("Hello World " + a + b);

	}

}