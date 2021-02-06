package JavaSessions;

public class Login {

	// Method Overloading: part of OOP - Compile time Poly+Morphism

	// within the same class, if we have multiple methods with the same name but
	// 1. different parameters
	// 2. and the sequence of the params is also different

	public void doLogin() {// 0 param

	}

	public void doLogin(int a) {// 1 param

	}

	public void doLogin(int a, int b) {// 2 params

	}

	public void doLogin(int a, String b) {// 2 params

	}

	public void doLogin(String a, int b) {// 2 params

	}
	
	

	// login feature method overloading:

	public void login() {
		System.out.println("login with no param");
	}

	public void login(String un, String pwd) {
		System.out.println("login with 2 params " + un + pwd);
	}

	public void login(String un, String pwd, String role) {
		System.out.println("login with 3 params" + un + pwd + role);
	}

	public void login(String un, String pwd, int otp) {
		System.out.println("login with 3 params" + un + pwd + otp);
	}

	public void login(String un, String pwd, long phone) {
		System.out.println("login with 3 params" + un + pwd + phone);
	}

	public boolean login(long ph, int otp) {

		System.out.println("login with ph and otp");

		return true;
	}

	//
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void search(String name, int price, String color) {

	}

	//
	public void doPayment(String UPI) {

	}

	public void doPayment(String UPI, long ph, int otp) {

	}

	public void doPayment(long CC, int cvv) {

	}

	public void doPayment(String AmazonPay, String pwd, int otp) {

	}

	public void addToCart() {

	}

	public void addToCart(String name) {

	}

	public void cabBooking() {

	}

	public void cabBooking(String st, String end) {

	}

	public void cabBooking(String st, String end, String carType) {

	}
	
	public void cabBooking(String st, String end, String carType, String couponCode) {

	}
	
	
	

	public static void main(String[] args) {

		Login lp = new Login();
		lp.login();
		lp.login("admin", "admin123");
		lp.login("naveen", "naveen123", 909000);

		if (lp.login(9898989, 1234)) {
			System.out.println("home page is displayed");
		}
		

	}

}