package JavaSessions;

public class StringReverseConcept {

	public static void main(String[] args) {

		
		String str = "Testing world with selenium"; //muineleS
		
		char arr[] = str.toCharArray();
		String rev = "";
		
		 
		for(int p = arr.length-1; p>=0; p--) {
			
			rev = rev + str.charAt(p); //muineleS
		}
		
		System.out.println(rev);
		
		//Time Complexity:
		//worst case: O(n)
		//Best Case: O(1)
		//Average Case: O(n)
		
		
		
	}

}