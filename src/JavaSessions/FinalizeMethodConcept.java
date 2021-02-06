package JavaSessions;

public class FinalizeMethodConcept {

	String name = "Java";

	public static void main(String[] args) {

		// final int i = 10;
		// finally should be used with try

		FinalizeMethodConcept obj = new FinalizeMethodConcept();
		
		System.out.println(obj.name);
		
		obj = null;

		Employee e = new Employee();
		e = null;

		System.out.println("calling GC");

		System.gc();

	}

	@Override
	public void finalize() {
		System.out.println("inside finalize method...");
	}

}