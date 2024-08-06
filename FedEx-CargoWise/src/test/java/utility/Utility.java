package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static String getExcelData(int row, int col) throws EncryptedDocumentException, IOException 
	{
		 
		String path = "C:\\Testing Project\\Excel File\\testdata.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet s = WorkbookFactory.create(file).getSheet("TestData");
		String value = s.getRow(row).getCell(col).getStringCellValue();
		 return value;
	   	 
	}
	public static void takeScreenshot(WebDriver driver ) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Testing Project\\Screenshots\\"+System.currentTimeMillis()+"Screnshot.jpg");
		FileHandler.copy(source, desti);
    } 

}
