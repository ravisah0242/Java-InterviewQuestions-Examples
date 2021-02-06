package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array:
		//two major limitations:
		//1. size is fixed: static array: to overcome this issue, we use dynamic array (ArrayList)
		//2. it stores similar types of data: to overcome this issue, we can use Object Array (but this is also static)
		//so we can use ArrayList with Generics.
		
		
		//1. int array:
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException

		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
		
		int len = i.length;
		System.out.println("len = " + len);
		System.out.println("Hi = " + (len-1));
		System.out.println("Li = " + 0);
		
		//to print all the values from array: for loop:
		
		for(int k=0; k<4; k++) {
			System.out.println(i[k]);//10 20 30 40 
		}
		
		//double array:
		
		double d[] = new double[2];
		d[0] = 12.22;
		d[1] = 34.33;
		
		System.out.println(d[0]+ d[1]);
		
		//char:
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = '$';
		
		System.out.println(c[0] + c[1]);
		
		//String Array:
		String student[] = new String[3];
		student[0] = "Tom";
		student[1] = "Lisa";
		student[2] = "Peter";
		
		for(int m=0; m<student.length; m++) {
			System.out.println(student[m]);
		}
		
		for(int m=0; m<=student.length-1; m++) {
			System.out.println(student[m]);
		}

		//Object Array: to store different types of data:
		
		Object ob[] = new Object[5];
		ob[0] = "Tom";
		ob[1] = 30;
		ob[2] = 35.44;
		ob[3] = true;
		ob[4] = 'm';
		
		for(int g=0; g<ob.length; g++) {
			System.out.println(ob[g]);
		}
		
		
		
	}

}