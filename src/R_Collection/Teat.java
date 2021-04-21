package R_Collection;

public class Teat {

	public static void main(String[] args) {


		String s1="Ravi Teja\n";
		
		String s5=s1 + s1 + s1 + s1 + s1;
		String s10= s5 + s5;
		String s50= s10 + s10 + s10 +s10 +s10;
		
		System.out.println(s50);
		//===========================================
		 String str = "geekss@for@geekss"; 
		  String[] spl = str.split("@",2); 
		  for(String a : spl) 
		  { System.out.println(a); }
		  
		  //==================================================
		  
		  /*static void printNum (int n)
			{
				if(n>0)
				{
					printNum(n-1);
					System.out.println(n);
				}
			}

			public static void main(String[] args) 
			{
				printNum(20);
			}*/
		  
		  //=====================================================
		  
		/*//File file= new File("./testinfo/testdata.xlsx");
			FileInputStream fis = new FileInputStream("./testinfo/testdata.xlsx");
		    
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheet("Sheet1");
			
			 int countrow = sheet.getLastRowNum();
			 System.out.println(countrow); 
			 
			 short countcol = sheet.getRow(0).getLastCellNum();
			 System.out.println(countcol);
			
			String data0 = sheet.getRow(0).getCell(1).getStringCellValue();
		     System.out.println("Data frome exel is "+data0);
		    
		     for(int i=0; i<countrow; i++)
			 {
	                XSSFRow currentrow = sheet.getRow(i);
				 
				 for(int j=0; j<countcol; j++)
				 {
					String value = currentrow.getCell(j).toString();// read the value from a exel
					 System.out.print("   " +value);
				 }
				 System.out.println();
		    	   
				 for(int j=0; j<countcol; j++)
					 
				 {
					 XSSFRow currentrow = sheet.getRow(i);
					String value = currentrow.getCell(j).toString();// read the value from a exel
					 System.out.print("  " +value);
				 }
				 System.out.println();
			 }
		     
			
			
			
			
			
		}*/
		  
		  
		  
		  

	}

}
