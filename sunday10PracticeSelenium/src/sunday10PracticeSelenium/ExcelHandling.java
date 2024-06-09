package sunday10PracticeSelenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHandling {
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream file = new FileInputStream("D:\\TestData.xlsx");
		Sheet Sheet =WorkbookFactory.create(file).getSheet("hemant");
		
//		for(int i =0 ;i<=2;i++) {
//			for(int j=0;j<=2;j++) {
//			String value=Sheet.getRow(i).getCell(j).getStringCellValue();
//			System.out.print(value +" ");
//			}
//			System.out.println();
//		}
//		
		 double value = Sheet.getRow(2).getCell(3).getNumericCellValue();
		 System.out.println(value);
		
		
	}
}
