package java_pawan;

public class ArrayLinearSerchIn {

	public static void main(String[] args) {
		
		int[] numbers= {10,20,30,40,50,60};
		
		int serchnum=30;
		boolean flag=false;
		
		for(int i=0; i<numbers.length; i++)
		{
			//System.out.println(numbers[i]);
			
			if(serchnum==numbers[i])
			{
				System.out.println("find Element --> "+i);   // index Return;
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element are not found --> ? ");	
		}
	}

}
