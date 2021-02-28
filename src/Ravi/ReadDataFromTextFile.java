package Ravi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// 1. Approach--->
		
		FileReader fr=new  FileReader("C:\\Users\\Ravi\\OneDrive\\Desktop\\Log Files.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str = br.readLine()) != null)
		{
			System.out.println(str);
		}
		
		br.close();
		
		// 2. Approach--->
		
		File file=new File("C:\\Users\\Ravi\\OneDrive\\Desktop\\Log Files.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		
		// 3. Approach--->
		File file1=new File("C:\\Users\\Ravi\\OneDrive\\Desktop\\Log Files.txt");
		Scanner sc1=new Scanner(file1);
		sc1.useDelimiter("\\Z");
		System.out.println(sc1.next());		
		
	}

}
