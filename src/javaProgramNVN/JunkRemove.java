package javaProgramNVN;

public class JunkRemove {

	public static void main(String[] args) {

		String s="Ravi^^%$$$$%&.RK#$)(***Rani @@@@%%###Sah";
		String s2="Ravi SACRfafcbhb";
		
		String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf("RK"));
		
		System.out.println(s.indexOf("Have"));   // -1 Output
		
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.substring(0,6));
		
		
	}

}
