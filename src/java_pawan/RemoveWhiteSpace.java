package java_pawan;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str="Java    Selenium 		   Testing";
		
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		

	}

}
