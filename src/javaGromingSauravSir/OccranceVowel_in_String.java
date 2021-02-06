package javaGromingSauravSir;

public class OccranceVowel_in_String {
	
	
	//wap to fetch the occurance of vowel of a given string
	
		public static void main(String[] args){
			String s="Himalaya";
			int count=0;
			char[] ch=s.toCharArray();
			for(char ch1:ch)
				{
					if(ch1=='a' | ch1=='e' | ch1=='i' | ch1=='o' | ch1=='u')
					{
						count++;
					}
				}
			System.out.print("Occurance of vowel is===>>>"+ count);
	}

}
