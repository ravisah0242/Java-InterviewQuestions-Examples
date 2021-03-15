package vikash;

import java.util.Arrays;

public class AnagramString{
    static void isAnagram(String str1, String str2)
    {
        String s1=str1.replaceAll("\\s","");
        String s12=str2.replaceAll("\\s","");

        boolean status=true;

        String s2 = null;
		if(s1.length()!=s2.length())
        {
            status=false;
        }
        else
        {
            char[] ArraS1=s1.toLowerCase().toCharArray();
            char[] ArraS2=s2.toLowerCase().toCharArray();

            Arrays.sort(ArraS1);
            Arrays.sort(ArraS2);
            status=Arrays.equals(ArraS1,ArraS2);
        }

        if(status)
        {
            System.out.println(s1+"and"+s2+"This is Anagram");
        }
        else
        {
            System.out.println(s1+"and"+s2+"This is Not Anagram");
        }
    }

    public static void main(String[] args)
    {
        isAnagram("Ravi", "Sah");
        isAnagram("Dori", "Pawan");
        isAnagram("Mahabharat", "Ramayan");
    }



}