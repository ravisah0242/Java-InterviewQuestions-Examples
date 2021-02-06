package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		
		
		
		
		//1. while:
		//1 to 10:
		int i = 1;//starting: Initialization
		while(i<=100) { //conditional
			System.out.println(i);//1234...10 (statement)
			i++; //Increment/decrement
		}
		
		int count = 1;
		while(count<=100) {
			System.out.println(count);
				if(count % 5 == 0)
				{
					System.out.println("Hello !!");
				}
			//++count;
			//count++;
			count = count + 1;
			
		}
		
		System.out.println("-------");
		
		//2. for loop:
		//1 to 10:
		for(int k = 1; k<=10; k++) {
			System.out.println(k);//12345...10
		}
		
		System.out.println("-------");
		int k;
		for(k = 1; k<=10;) {
			System.out.println(k);//12345...10
			k++;
		}
		
		//Infinite loop:
//		for(;;) {
//			System.out.println("Hii");
//		}
		
		System.out.println("---a to z----");
		for(char c1='a'; c1<='z'; c1++) {
			System.out.println(c1);
		}
		
		System.out.println("-------");

		for(double d=1.1; d<=5.0; d++) {
			System.out.println(d);
		}
		System.out.println("-------");
		
		//2 4 6 8 10 -- even numbers
		for(int even=2; even<=10; ) {
			System.out.println(even);//2 4
			even=even+2;
		}
		
		System.out.println("-------");

		//1 3 5 7 9 -- odd numbers:
		for(int odd=1; odd<=10; odd=odd+2) {
			System.out.println(odd);
		}
		
		//
		System.out.println("---newwww----");

		for(int even=2; even<=10; even++) {
			System.out.println(even);//2 4 6
			even++;//3 5
		}

		System.out.println("-------");

		//do-while:
		//print 1 to 10:
		
		int p = 1;
		do {
			System.out.println(p);
			p++;
		} 
		while (p<=10);
		
		//while infinite loop:
//		while(true) {
//			System.out.println("Weclome to Taj");
//		}
		
		
		//do-while infinite loop:
		int q = 1;
		do {
			System.out.println(q);//12
			q++;
		} 
		while (true);
		
		
	}

}