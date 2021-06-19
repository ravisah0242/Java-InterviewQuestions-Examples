package Tricky;

public class A {

	public A()
	{
		System.out.println("Line A Constructor");
	}
	
	public void a()
	{
		System.out.println("Line A Method");
	}
}
//==========================================================================================================
class B extends A{
	
	public B()
	{
		 System.out.println("Line B Constructor");
	}
	public void b()
	{
		System.out.println("Line B Method");
	}
}
//===========================================================================================================
class C extends B{
	
	public C()
	{
		System.out.println("Line C Constructor");
	}
	public void c()
	{
		System.out.println("Line C Method");
	}
}