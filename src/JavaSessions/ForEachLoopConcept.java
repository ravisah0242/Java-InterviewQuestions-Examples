package JavaSessions;

public class ForEachLoopConcept {

	public static void main(String[] args) {

		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		//typical for loop:
		for(int p=0; p<i.length; p++) {
			System.out.println(i[p]);
			
				if(i[p] == 20) {
					System.out.println("hey 20 is found....");
				}
		}
		
		System.out.println("-----");
		
		//for each:
		for(int e : i) {
			System.out.println(e);
			
			if(e==20) {
				System.out.println("hey 20 is found....");
			}
		}
		
		
		String student[] = new String[3];
		student[0] = "Tom";
		student[1] = "Lisa";
		student[2] = "Peter";
		
		for(String e : student) {
			System.out.println(e);
		}
		
		//
		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 30;
		ob[2] = 35.44;
		ob[3] = true;
		ob[4] = 'm';
		
		for(Object t : ob) {
			System.out.println(t);
		}
		
		
		
	}

}