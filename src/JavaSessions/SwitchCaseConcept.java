package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "Opera";

		switch (browser) {

		case "Chrome":
			System.out.println("launch chrome");
			break;

		case "Firefox":
			System.out.println("launch FF");
			break;

		case "Safari":
			System.out.println("launch Safari");
			break;

		case "IE":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("Please pass the correct browser name : " + browser);
			break;
		}

		int marks = 90;
		switch (marks) {
		case 100:
			System.out.println("GRADE A");
			break;

		case 90:
			System.out.println("GRADE B");
			break;

		case 80:
			System.out.println("GRADE C");
			break;

		default:
			System.out.println("FAIL...." + marks);
			break;
		}

		char c = 'z';
		switch (c) {
		case 'a':
			System.out.println("a");
			break;
		case 'e':
			System.out.println("e");
			break;
		case 'i':
			System.out.println("i");
			break;
		case 'o':
			System.out.println("o");
			break;
		case 'u':
			System.out.println("u");
			break;

		default:
			System.out.println("no");
			break;
		}

	}

}