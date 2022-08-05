package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
	
	public static WebDriver driver;
	public static Actions a;
	
	public static void browserlaunch() {
	
       WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
    }
	
	public static void urlLauch(String url) {
		driver.get(url);
	}
	public static void maxwindow() {
	    driver.manage().window().maximize();
	}
	
	public static void fillText(WebElement element,String value) {
		element.sendKeys(value);	
	}
	
	public static void clickbtn(WebElement element) {
		element.click();
	}
	
	public static void screenshot(String snap) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Aravinth MS\\Desktop\\Testing- Selnium\\New folder\\MavenApril11.30\\Screenshots"+snap+".png");
		FileUtils.copyFile(source, target);
	}
    public static void Mousehover(WebElement element) {
	     a = new Actions(driver);
	     a.moveToElement(element).perform();
	    
    }
	public static void dragAndDrop(WebElement source, WebElement target) {
		
		a.dragAndDrop(source, target).perform();
		
	}
	
    public static String excelread(int row,int cell) throws IOException {

    	File f = new File("C:\\Users\\Aravinth MS\\Desktop\\Testing- Selnium\\New folder\\MavenApril11.30\\ExcelFiles\\File1.xlsx");
	    FileInputStream fin = new FileInputStream(f);
	    Workbook w = new XSSFWorkbook(fin);
	    Sheet s = w.getSheet("Sheet1");
			
	    	Row r1 = s.getRow(row);
		    Cell c1 = r1.getCell(cell);
				String value;
		        int type = c1.getCellType();
				if (type ==1 ) {
				value = c1.getStringCellValue();
				}
		       else if (DateUtil.isCellDateFormatted(c1)) {
					Date d = c1.getDateCellValue();
					SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
					value = s1.format(d);
				}
			    else {
				double d1 = c1.getNumericCellValue();
					long l =(long)d1;
					value = String.valueOf(l);
					
				}
				return value;
    }
     
    public static void closebrowser() {
		driver.close();
		
    	
	}

    public static void findsystime() {
     Date d = new Date();
     System.out.println(d);
    
	}
    
}



				
				
    	


	
	

