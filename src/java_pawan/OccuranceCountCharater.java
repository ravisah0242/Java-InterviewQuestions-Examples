package java_pawan;

public class OccuranceCountCharater {

	public static void main(String[] args) {


		String s="Java Programing java opps";
		int leng=s.length();
		System.out.println(leng);
		
		String s1=s.replaceAll("a", "");
		int leng1=s1.length();
		System.out.println(leng1);
		
		System.out.println("Number of Occurance of a::--->  "+(leng-leng1));

	}

}
