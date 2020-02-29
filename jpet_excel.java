package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class jpet_excel {
	

	protected static String[][] testdata1= new String[2][3];
	int r,c;
	
	public void get_testdata() throws FileNotFoundException  {
	
	
	
	try {
		
		File f=new File("C:\\Users\\BLTuser.BLT0191\\software\\demo.xlsx");

		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet4");
		for(r=0;r<2;r++) {
			XSSFRow row = sh.getRow(r);
//			for(c=0;c<5;r++) {				
				XSSFCell cell1 = row.getCell(0);
//				testdata1[r][c] =cell1.getStringCellValue();
//				System.out.println(d);
//				testdata1[r][c]=d;
//				System.out.println(testdata1[r][c]);
		
		testdata1[r][0]=cell1.getStringCellValue();
		System.out.println(testdata1[r][0]);

		XSSFCell cell2 = row.getCell(1);
		testdata1[r][1]=cell2.getStringCellValue();
		System.out.println(testdata1[r][1]);

		XSSFCell cell3 = row.getCell(2);
		testdata1[r][2]=cell3.getStringCellValue();
		System.out.println(testdata1[r][2]);
//
//		XSSFCell cell4 = row.getCell(3);
//		testdata1[r][3]=cell4.getStringCellValue();
//		System.out.println(testdata1[r][3]);
//		
//		
//		XSSFCell cell5 = row.getCell(4);
//		testdata1[r][4]=cell4.getStringCellValue();
//		System.out.println(testdata1[r][4]);
//		
//		XSSFCell cell6 = row.getCell(5);
//		testdata1[r][5]=cell6.getStringCellValue();
//		System.out.println(testdata1[r][5]);
//		String exp_res=testdata1[r][5];
//		
		 
		
		
	}}
	
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	

}
