package testrunner;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.WritingPage_Objects;

public class WritingPage {

	   @DataProvider(name="FetchData",parallel = true)
	   public Object[][] fetch(ITestContext testContext) throws Exception {
		   
		   String SheetName=testContext.getName();
		   String filepath=new File("C:\\Users\\User\\workspace\\BasicCalc\\src\\test\\resources\\TestData\\BasicCalc_HomePage6.xlsx").getAbsolutePath();
		   
		   FileInputStream fis=new FileInputStream(filepath);
		   Workbook xssfWorkbook=new XSSFWorkbook(fis);
		   
		   Sheet sheet=xssfWorkbook.getSheet(SheetName);
		   ArrayList<HashMap<String,String>> data=new ArrayList<HashMap<String, String>>();
		   
		   Row columnheader=sheet.getRow(0);
		   
		   int i=0;
		   for(Cell row:columnheader){
			   if(row.getStringCellValue().contains("RunMode")){
				   System.out.println("Found RunMode");
				   break;
			   }
			   i++;
		   }
		 
		   for(int j=1;j<sheet.getPhysicalNumberOfRows();j++){
			       System.out.println("Total Number of Rows : "+sheet.getPhysicalNumberOfRows());
			  HashMap<String, String> map=new HashMap();
			  Row currentrow=sheet.getRow(j);
			  System.out.println("Current Row : "+currentrow);
			  if(currentrow.getCell(i).getStringCellValue().contains("Yes")){
				  System.out.println("Total number of columns : "+currentrow.getLastCellNum());
				  for(int k=0;k<currentrow.getLastCellNum();k++){
					  try{
						  map.put(columnheader.getCell(k).getStringCellValue(),currentrow.getCell(k).getStringCellValue());
						  
					  }
					  catch(Exception e){
						  System.out.println("exception : "+e);
						  System.out.println("Exception Occured possibly no data found .. proceeding further");
					  }
				  }
				  data.add(map);
			  }
		   }
		   Object[][] datavalue=new Object[data.size()][1];
		   System.out.println("Data Size : "+data.size());
		   for(int a=0;a<data.size();a++){
			   datavalue[a][0]=data.get(a);
		   }
		   return datavalue;
		   
	   }
	   
	 //all lists here will be passed one by one to below method...ex - if excel has 2 rows, with run mode yes, each wil be passed one after the other
	   @Test(dataProvider = "FetchData")
	   
	   public void writepage_Disp(HashMap<String,String> data) throws InterruptedException {
		   System.out.println("Going to connect Windows");
		   //System.setProperty("webdriver", "C:/All Backup Files Folders 4th June 2013/Raghu_Main_Directory_To_Refer/Learnings/Selenium/Chrome_WebDriver/chromedriver.exe");
		   System.setProperty("webdriver.chrome.driver", "C:/Users/User/workspace/BasicCalc/ChromeDriver/chromedriver.exe"); 
		   ChromeOptions options=new ChromeOptions();
		   options.addArguments("--remote-allow-origins=*");
		   WebDriver driver=new ChromeDriver(options);

		   //WebDriverManager.chromedriver().clearDriverCache().setup();  // Added By Raghu to handle errors
		   //WebDriverManager.chromedriver().clearResolutionCache().setup(); // Added By Raghu to handle errors
		   driver.manage().window().maximize();
		   Thread.sleep(5000);
		   driver.get("https://testsheepnz.github.io/writing.html");
		   System.out.println("Data : "+data);
		   String iswritepage = "Y";
		   
		   System.out.println("Inside WritingPage Objects");
		   WritingPage_Objects obj=new WritingPage_Objects(driver,data);
		   //start from here
		   obj.click_writingpagemenu();
		   System.out.println("Outside WritingPage Objects");
		   driver.navigate().back();
		   
		   
		  
	   }
	   
	   @BeforeMethod
	   
	   public void beftest() {
			System.out.println("Test Execution Starts");
		}
	   
	   
	   
}
