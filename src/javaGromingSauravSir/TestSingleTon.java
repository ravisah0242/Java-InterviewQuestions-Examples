package javaGromingSauravSir;

public class TestSingleTon 
{
	public static void main(String[] args) {
		
		// used Singleton to object creation one time ;
		
		//CheckSingleTon c1=new TestSingleTon();		
	}

}

class CheckSingleTon
{
	
		static int count=1;
		static CheckSingleTon c;
		private CheckSingleTon()
		{
			System.out.println("Private Constractor Runing");
			count++;
		}
		
		public static CheckSingleTon getSingleToneInstance()
		{
			if(count ==1)
			{
				c=new CheckSingleTon();
			}
			return c;
			
		}

}


