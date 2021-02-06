package javaGromingSauravSir;

public class D implements C
{

	public static void main(String[] args)
	{
		
		//C c=new C();
		D d=new D();
		d.m1();
		d.m2();
		

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
