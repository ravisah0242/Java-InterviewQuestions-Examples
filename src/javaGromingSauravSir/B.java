package javaGromingSauravSir;

public class B  extends A
{

	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.m2();
		
		//A a=new A();
		
		
	}

	@Override
	public void m1() {
		System.out.println("M1 method");
		
	}

	@Override
	public void m2() {
		
		System.out.println("M2 Method");
	}
	
}
