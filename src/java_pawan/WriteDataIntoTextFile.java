package java_pawan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\Ravi\\OneDrive\\Desktop\\Log Files.txt");
		
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Selenium with java ");
		bw.write("Selenium with java ");
		bw.write("Selenium with java ");
		bw.write("Selenium with java ");
		bw.write("Finish!!!!!!!!!!!!");
		
		bw.close();
	}

}
