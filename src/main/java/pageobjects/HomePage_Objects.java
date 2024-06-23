package pageobjects;

import java.io.IOException;
import java.util.HashMap;

import basepage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentTest;

import freemarker.core.ReturnInstruction.Return;

public class HomePage_Objects extends BaseClass {
	
	private static final String Return = null;
	//all actions from home page must be happening in this page only - meanoing all xpaths/locators and actions - include methods to perform actions and call baseclass methods for selenium actions
	
	
	public String xpath_testsheepnz = "//a[contains(@href,'./index.html#page-top')]";
	public String xpath_numbergame="(//li[@class='nav-item']/a)[1]";
	public String xpath_automationkata="(//li[@class='nav-item']/a)[2]";
	public String xpath_workshops="(//li[@class='nav-item']/a)[3]";
	public String xpath_media="(//li[@class='nav-item']/a)[4]";
	public String xpath_miketalks="(//li[@class='nav-item']/a)[5]";
	public String xpath_build = "//select[@id='selectBuild']";
	public String xpath_first_number = "//input[@id='number1Field']";
	public String xpath_second_number = "//input[@id='number2Field']";
	public String xpath_operation = "//select[@id='selectOperationDropdown']";
	public String xpath_calculate = "//input[@id='calculateButton']";
	public String xpath_answer = "//input[@id='numberAnswerField']";
	public String xpath_integersel = "//input[@id='integerSelect']";
	public String xpath_clearbutton = "//input[@id='clearButton']";
	public String xpath_addoption = "//select[@id='selectOperationDropdown']/option[@value='0']";
	public String xpath_substractoption = "//select[@id='selectOperationDropdown']/option[@value='1']";
	public String xpath_multiplyoption = "//select[@id='selectOperationDropdown']/option[@value='2']";
	public String xpath_divideoption = "//select[@id='selectOperationDropdown']/option[@value='3']";
	public String xpath_concatenateoption = "//select[@id='selectOperationDropdown']/option[@value='4']";
	public String xpath_thegame = "(//div[@class='portfolio-hover'])[1]";
	public String xpath_instructions = "(//div[@class='portfolio-hover-content'])[1]";
	public String xpath_reportanissue = "((//div[@class='portfolio-hover'][1])[1])";
	public String xpath_logging = "//a[@id='gotoNumberGameWithLoggingButton']";
	public String xpath_currentversion = "//a[@id='gotoPantherODMButton']";
	public String xpath_builds = "//a[@id='gotoPantherODMBuildsButton']";
	public String xpath_documents = "//a[@id='gotoPantherDocs']";
	public String xpath_obliquetesting = "//a[@id='gotoTestingIdeas']";
	public String xpath_projectbalto = "//a[@id='gotoBalto']";
	public String xpath_projectglinda = "//a[@id='gotoGlinda']";
	public String xpath_thecolony = "//a[@id='gotoColony']";
	public String xpath_testplandashboard = "//a[@id='gotoDashboard']";
	public String xpath_basiccalculator = "//a[@id='gotoBasicCalc']";
	public String xpath_minimumviablepanther = "//a[@id='gotoMinimumViablePantherODMButton']";
	public String xpath_minimumviablecalculator = "//a[@id='gotoMinViableCalc']";
	public String xpath_video = "//a[@id='gotoVideo']";
	public String xpath_writing = "//a[@id='gotoWriting']";
	
	//do same for rest of the 4 menus
	
    
    HashMap<String,String> data=new HashMap<String, String>();

    WebDriver driver;

    public HomePage_Objects(WebDriver driver,HashMap<String,String> data){
        this.driver=driver;
        this.data=data;
    }

    
    
    public void click_homepagemenu() throws InterruptedException{
    	
    	String menutobeclicked=data.get("Menu");
    	String expectedurl=data.get("Expectedurl");
    	String actualurl = driver.getCurrentUrl();
    	String firstnum=data.get("FirstNum");
    	System.out.println("FirstNum : "+firstnum);
    	String secondnum=data.get("SecondNum");
    	System.out.println("SecondNum : "+secondnum);
    	String expectedval=data.get("ExpectedVal");
    	System.out.println("ExpectVal : "+expectedval);
    	
    	
    	int compurlval = expectedurl.compareTo(actualurl);
    	
    	System.out.println("Menu to be clicked :"+menutobeclicked);
    	
    	switch(menutobeclicked){
    	
    	case "NumberGame":
    		
    		ClickElement(driver, xpath_numbergame);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Number Game is matching");
        	}
    		
    		//if (expectedurl.compareTo(actualurl))!=0 {
    			
    		//}
    		
    		//driver.navigate().back();
    		break;
    	case "TestSheepNZ":
    		
    		ClickElement(driver, xpath_testsheepnz);
    		Thread.sleep(5000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Testing of Url TestSheepNZ is Starting");
    		if (compurlval == 0) {
        		System.out.println("Url TestSheepNZ is matching");
        	}
    		
    		//if (expectedurl.compareTo(actualurl))!=0 {
    			
    		//}
    		
    		//driver.navigate().back();
    		System.out.println("Testing of Url TestSheepNZ is Ending");
    		break;
        case "AutomationKata":
    		
    		ClickElement(driver, xpath_automationkata);
    		Thread.sleep(2000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		if (compurlval == 0) {
        		System.out.println("Url is matching");
        	}
    		
    		//if (expectedurl.compareTo(actualurl))!=0 {
    			
    		//}
    		
    		//driver.navigate().back();
    		break;
    		
        case "Workshops":
    		
    		ClickElement(driver, xpath_workshops);
    		Thread.sleep(2000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		if (compurlval == 0) {
        		System.out.println("Url is matching");
        	}
    		
    		//if (expectedurl.compareTo(actualurl))!=0 {
    			
    		//}
    		
    		//driver.navigate().back();
    		break;
        case "Media":
    		
    		ClickElement(driver, xpath_media);
    		Thread.sleep(2000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		if (compurlval == 0) {
        		System.out.println("Url is matching");
        	}
    		
    		//if (expectedurl.compareTo(actualurl))!=0 {
    			
    		//}
    		
    		//driver.navigate().back();
    		break;
        case "MikeTalks":
    		
    		ClickElement(driver, xpath_miketalks);
    		Thread.sleep(2000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		if (compurlval == 0) {
        		System.out.println("Url is matching");
        	}
    		
    		//if (expectedurl.compareTo(actualurl))!=0 {
    			
    		//}
    		
    		//driver.navigate().back();
    		break;
    		/*
       case "AddOperation":
    	    driver.findElement(By.xpath(xpath_first_number)).sendKeys(firstnum);
    	    driver.findElement(By.xpath(xpath_first_number)).sendKeys(secondnum);
    	    driver.findElement(By.xpath(xpath_addoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    driver.findElement(By.id(xpath_answer)).getText();
    	    Thread.sleep(3000);
    	    if (expectedval == retnval) {
    	    	System.out.println("Addition Success");
    	    }
    	    else {
    	    	System.out.println("Addition Fails");
    	    }
    	    
    		break;
    		*/
    		
    		
    		
    	}
    	
    	
   
    	
    }



	public void bascalcultor(String Operationname, String ExpectValue, String homepage ) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		 
		//String retnval = " ";
		//retnval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
		driver.findElement(By.xpath(xpath_first_number)).clear();
	    driver.findElement(By.xpath(xpath_second_number)).clear();
		switch(Operationname){
		case "AddOperation":
    	    driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
    	    driver.findElement(By.xpath(xpath_second_number)).sendKeys(data.get("SecondNum"));
    	    driver.findElement(By.xpath(xpath_addoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	  
    	    JavascriptExecutor base = (JavascriptExecutor) driver;
    	    String retnval = " ";
    	    retnval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+data.get("ExpectedVal"));
    	    System.out.println("Actual Val : "+retnval);
    	    
    	    //if (Integer.parseInt(data.get("ExpectedVal")) == Integer.parseInt(retnval)) {
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(retnval)) {
    	    	System.out.println("Addition Success");
    	    }
    	    else {
    	    	System.out.println("Addition Fails");
    	    }
    	    driver.findElement(By.xpath(xpath_clearbutton)).click();
    		break;
		case "SubstractOperation":
    	    driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
    	    driver.findElement(By.xpath(xpath_second_number)).sendKeys(data.get("SecondNum"));
    	    driver.findElement(By.xpath(xpath_substractoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	    String retnsubval = " ";
    	    retnsubval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+data.get("ExpectedVal"));
    	    System.out.println("Actual Val : "+retnsubval);
    	    
    	   // if (Integer.parseInt(data.get("ExpectedVal")) == Integer.parseInt(retnsubval)) {
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(retnsubval)) {
    	    	System.out.println("Substraction Success");
    	    }
    	    else {
    	    	System.out.println("Substraction Fails");
    	    }
    	    driver.findElement(By.xpath(xpath_clearbutton)).click();
    		break;
		case "MulitiplyOperation":
    	    driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
    	    driver.findElement(By.xpath(xpath_second_number)).sendKeys(data.get("SecondNum"));
    	    driver.findElement(By.xpath(xpath_multiplyoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	    String retnmultiplyval = " ";
    	    retnmultiplyval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    //String retnmultiplyval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    //Thread.sleep(3000);
    	    System.out.println("Expected Val : "+data.get("ExpectedVal"));
    	    System.out.println("Actual Val : "+retnmultiplyval);
    	    
    	    //if (Integer.parseInt(data.get("ExpectedVal")) == Integer.parseInt(retnmultiplyval)) {
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(retnmultiplyval)) {
    	    	System.out.println("Multiplication Success");
    	    }
    	    else {
    	    	System.out.println("Multiplication Fails");
    	    }
    	    driver.findElement(By.xpath(xpath_clearbutton)).click();
    		break;
		case "DivideOperation":
    	    driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
    	    driver.findElement(By.xpath(xpath_second_number)).sendKeys(data.get("SecondNum"));
    	    driver.findElement(By.xpath(xpath_divideoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	    String retndivideval = " ";
    	    retndivideval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+data.get("ExpectedVal"));
    	    System.out.println("Actual Val : "+retndivideval);
    	    
    	    //if (Integer.parseInt(data.get("ExpectedVal")) == Integer.parseInt(retndivideval)) {
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(retndivideval)) {
    	    	System.out.println("Division Success");
    	    }
    	    else {
    	    	System.out.println("Division Fails");
    	    }
    	    driver.findElement(By.xpath(xpath_clearbutton)).click();
    		break;
		case "ConcatenateOperation":
    	    driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
    	    driver.findElement(By.xpath(xpath_second_number)).sendKeys(data.get("SecondNum"));
    	    driver.findElement(By.xpath(xpath_concatenateoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	    String retnconcatval = " ";
    	    retnconcatval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+data.get("ExpectedVal"));
    	    System.out.println("Actual Val : "+retnconcatval.trim());
    	    
    	    //if (data.get("ExpectedVal").equals(retnconcatval.trim())) {
    	    if (ExpectValue.equals(retnconcatval.trim())) {
    	    	System.out.println("Concatenation Success");
    	    }
    	    else {
    	    	System.out.println("Concatenation Fails");
    	    }
    	    TakeScreenshot(driver);
			driver.findElement(By.xpath(xpath_clearbutton)).click();

			break;
		
		}
	}
    
    
    
    
	public void bascalcultornew(String Operationname, String FirstNumber, String SecondNumber, String ExpectValue,String entrypoint) throws InterruptedException {
		// TODO Auto-generated method stub
		 
		if(entrypoint.contains("Homepage")){
		String retnval = " ";
		retnval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
		
                driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
    	        driver.findElement(By.xpath(xpath_second_number)).sendKeys(data.get("SecondNum"));
                String finalretnval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
               String finalexpectedval = data.get("ExpectedVal");
		}
		switch(Operationname){
		case "AddOperation":
    	   
    	    driver.findElement(By.xpath(xpath_addoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);

    	    JavascriptExecutor base = (JavascriptExecutor) driver;
    	    String finalretnval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+ExpectValue);
    	    System.out.println("Actual Val : "+finalretnval);
    	    
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(finalretnval)) {
    	    	System.out.println("Addition Success");
    	    }
    	    else {
    	    	System.out.println("Addition Fails");
    	    }
    		break;
		case "SubstractOperation":
    	    
    	    driver.findElement(By.xpath(xpath_substractoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	    String finalretnvalsub = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+ExpectValue);
    	    System.out.println("Actual Val : "+finalretnvalsub);
    	    
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(finalretnvalsub)) {
    	    	System.out.println("Substraction Success");
    	    }
    	    else {
    	    	System.out.println("Substraction Fails");
    	    }
    		break;
		case "MulitiplyOperation":
    	    
    	    driver.findElement(By.xpath(xpath_multiplyoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    
    	    
    	    Thread.sleep(3000);
    	    String finalretnvalmul = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+ExpectValue);
    	    System.out.println("Actual Val : "+finalretnvalmul);
    	    
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(finalretnvalmul)) {
    	    	System.out.println("Multiplication Success");
    	    }
    	    else {
    	    	System.out.println("Multiplication Fails");
    	    }
    		break;
		case "DivideOperation":
    	    
    	    driver.findElement(By.xpath(xpath_divideoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	    String finalretnvaldiv = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+ExpectValue);
    	    System.out.println("Actual Val : "+finalretnvaldiv);
    	    
    	    if (Integer.parseInt(ExpectValue) == Integer.parseInt(finalretnvaldiv)) {
    	    	System.out.println("Division Success");
    	    }
    	    else {
    	    	System.out.println("Division Fails");
    	    }
    		break;
		case "ConcatenateOperation":
    	   
    	    driver.findElement(By.xpath(xpath_concatenateoption)).click();
    	    driver.findElement(By.xpath(xpath_calculate)).click();
    	    Thread.sleep(3000);
    	    //String retnconcatval = " ";
    	    //retnconcatval = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    String finalretnvalcon = driver.findElement(By.xpath(xpath_answer)).getAttribute("value");
    	    System.out.println("Expected Val : "+ExpectValue);
    	    System.out.println("Actual Val : "+finalretnvalcon.trim());
    	    
    	    if (ExpectValue.equals(finalretnvalcon.trim())) {
    	    	System.out.println("Concatenation Success");
    	    }
    	    else {
    	    	System.out.println("Concatenation Fails");
    	    }
		
		}
    
  
	}
    




}
