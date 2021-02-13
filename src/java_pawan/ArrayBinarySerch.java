package java_pawan;

public class ArrayBinarySerch {

	public static void main(String[] args) {
		
		int[] number= {1,2,3,4,5,6,7,8,9,10};
		boolean flag=false;
		int key=5;
		int l=0;
		int h=number.length-1;
		
		while(l<h)
		{
			int m=(l+h)/2;
			if(number[m]==key)
			{
				System.out.println("Element found..-->"+key);
				flag=true;
				break;
			}
			if(number[m]<key)
			{
				l=m+1;
			}
			
			if(number[m]>key)
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element are Not Found..?");
		}
	}
}
