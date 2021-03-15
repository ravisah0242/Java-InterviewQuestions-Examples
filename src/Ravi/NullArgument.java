package Ravi;

public class NullArgument {

	public static void main(String a[]) {
		
		test(null);
	}
	
	public static void main(Object o) {
		System.out.println("Object Argument");
	}
	
	public static void main(String s) {
		System.out.println("String Argument");
	}

}
