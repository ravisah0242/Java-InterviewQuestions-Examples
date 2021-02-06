package JavaSessions;

public class Users {
	
	String name;
	int age;
	static String compName;
	
	public void getCity() {
		System.out.println("get city");
	}
	
	public static void getInfo() {
		System.out.println("get info");
	}
	
	public static void getInfo(int a) {
		System.out.println("get info" + a);
	}
	
	public static void getInfo(int a, String b) {
		System.out.println("get info" + a + b);
	}

	public static void main(String[] args) {

		//how to call non static vars and methods:
		//we have to create the Object:
		Users obj = new Users();
		obj.name = "Peter";
		obj.age = 25;
		obj.compName = "IBM";
		obj.getCity();
		obj.getInfo();
		
		//how to call static vars and methods:
		//1. you can call them directly within the class:
		
		compName = "HCL";
		getInfo();
		
		//2. by using class name:
		Users.compName = "MS";
		Users.getInfo();
		
		Users.getInfo(10);
		
	}

}