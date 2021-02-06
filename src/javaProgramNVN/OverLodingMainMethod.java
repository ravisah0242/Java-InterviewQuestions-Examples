package javaProgramNVN;

public class OverLodingMainMethod {

	public static void main(String[] args) {

		System.out.println("Main Method with String[] args");
		
		main(12);
		main("Rana");
		
		

	}
	
	public static void main(String args) {
		 System.out.println("testing 2");
	}
	
	public static void main(int a) {
		System.out.println("Integer Number 3");
	}
	
	public static void main(char d) {
		System.out.println("Charater Z 4");
	}
	

}
