package java_pawan;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] a= {5,7,9,34,5,23,12};
		int sum=0;
		
		/*for(int i=0; i<a.length; i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Numbers::- "+sum);*/

		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of Array is---->"+sum);
	}

}
