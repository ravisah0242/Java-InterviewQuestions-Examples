package JavaSessions;

public class Employee {
	
	//class vars:
	String name;
	int age;
	double salary;
	char gender;
	boolean isPermanent;
	

	public static void main(String[] args) {

		//create the object of the class: use new keyword :
		
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.salary = 34.55;
		e1.gender = 'm';
		e1.isPermanent = true;
		
		Employee e2 = new Employee();
		e2.name = "Lisa";
		e2.age = 30;
		e2.salary = 45.66;
		e2.gender = 'f';
		e2.isPermanent = false;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.salary);
		System.out.println(e2.name + " " + e2.gender+ " " + e2.isPermanent);

		Employee e3 = new Employee();
		//e3.name = "Peter";
		e3.age = 35;
		
		System.out.println(e3.name + " " + e3.age + " " + e3.salary + " " 
					+ e3.gender + " " + e3.isPermanent);
		
		Employee e4 = new Employee();
		System.out.println(e4.name + " " + e4.age);
		
//		new Employee().name = "Steve";
//		new Employee().age = 25;
		
		//null reference:
		Employee e5 = new Employee();
		e5 = null;
		e5.name = "Naveen";//NullPointerException
		System.out.println(e5.name);
		
	}
	
	@Override
	public void finalize() {
		System.out.println("inside finalize method...for Employee class");
	}

}