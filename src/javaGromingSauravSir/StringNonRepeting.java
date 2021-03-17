package javaGromingSauravSir;

public class StringNonRepeting {

	public static void main(String[] args) {


		==1
		
		String[] names= {"java", "Python", "java", "Ruby", "C#", "C++","Ruby"};
		for(int i=0; i<names.length; i++)
		{
			for(int j=i; j<names.length; j++)
			{
				if(names[i]!=names[j])		// .equals or == ;
				{
					System.out.println("duplicate aelement are---> "+names[i] );
				}
			}
		}

	}

}
