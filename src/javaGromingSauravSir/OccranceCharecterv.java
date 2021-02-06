package javaGromingSauravSir;

public class OccranceCharecterv {
	
	//To print the occurance of chacter present in the string
	// Repeting a Charater
		public static void main(String[] args)
		{
			String s="Viakasa is good an cute bhacha";
			char[] ch=s.toCharArray();
			short count=0;

			for(char ch1: ch)
			{
				if(ch1=='a')
					{
					count++;
					}
			}
			System.out.print("Occurance of charcter in an array is===>>>>"  + count);
		}
}
