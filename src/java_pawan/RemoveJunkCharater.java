package java_pawan;

public class RemoveJunkCharater {

	public static void main(String[] args) {
		
		
		String s="Ravi  #@&^%*()Ranjan";
		String s1 = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
		System.out.println(s1);

	}

}
