package Ravi;



public class SingleTon {
	
	// SingleTone Class is that can have only one object (instance of the class) at a time.
	// How to Design Single Class 
	// 1. Make Constructor as a Private
	// 2. write a public static method(GetInstance) that has return type of object of this single ton class (Lazy initialization)
	// 3. 
	
	public static SingleTon SingleTon_Instance=null;
	public String str;
	
	private SingleTon() {
		str="Hey i am using SingleTon class pattern";
	}
	
	public static SingleTon GetInstance(){
		if(SingleTon_Instance==null){
			SingleTon_Instance=new SingleTon();
			
		}
		return SingleTon_Instance;
	}
	

	public static void main(String[] args) {
		
		SingleTon x = SingleTon.GetInstance();
		SingleTon y = SingleTon.GetInstance();
		SingleTon z = SingleTon.GetInstance();
		x.str=(x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		x.str=(x.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
