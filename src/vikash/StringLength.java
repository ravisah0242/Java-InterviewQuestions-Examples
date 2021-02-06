package vikash;

public class StringLength {
	
	//Calucate length of the string without using length() method


	
		public static void main(String[] args){
			String s="Vikas";
			short count=0;
			String[] str=s.split("");

			for(String str1:str)
			{
				count++;
			}
			System.out.print(count);
	}


}
