package pageobjects;

import java.io.IOException;
import java.util.HashMap;

import basepage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class NumberGamePage_Objects extends BaseClass {
	private static final String Return = null;
	

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
	public String xpath_first_number = "//input[@id='number1Field']";
	public String xpath_second_number = "//input[@id='number2Field']";
	
	HashMap<String,String> data=new HashMap<String, String>();

    WebDriver driver;

    public NumberGamePage_Objects(WebDriver driver,HashMap<String,String> data){
        this.driver=driver;
        this.data=data;
    }

 
    
    public void click_numbergamepagemenu() throws InterruptedException, IOException {
    	
    	String menutobeclicked=data.get("Menu");
    	String expectedurl=data.get("Expectedurl");
    	String actualurl = driver.getCurrentUrl();
    	String firstnum=data.get("FirstNum");
    	System.out.println("FirstNum : "+firstnum);
    	String secondnum=data.get("SecondNum");
    	System.out.println("SecondNum : "+secondnum);
    	String expectedval=data.get("ExpectedVal");
    	System.out.println("ExpectVal : "+expectedval);
    	String firstnumber=data.get("FirstNum");
    	String secondnumber=data.get("SecondNum");
    	String inputcalculation=data.get("Calculation");
    	String inputexpectedval=data.get("ExpectedVal");
    	String[] numericoperations = inputcalculation.split(",");
    	String[] expectedreturnvalue = inputexpectedval.split(",");
    	System.out.println("inputcalculation : "+inputcalculation);
    	
    	
    	
    	int compurlval = expectedurl.compareTo(actualurl);
    	
    	System.out.println("Menu to be clicked :"+menutobeclicked);
    	
    	switch(menutobeclicked){
    	
    	case "NumberGameGame":
    		
    		ClickElement(driver, xpath_thegame);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Number Game is matching");
        	}
    		
    		break;
        case "NumberGameInstructions":
    		
    		ClickElement(driver, xpath_instructions);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Game Instructions is matching");
        	}
    		
    		break;
        case "NumberGameReportAnIssue":
    		
    		ClickElement(driver, xpath_reportanissue);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Game Report an Issue is matching");
        	}
    		
    		break;
        case "NumberGameLogging":
    		
    		ClickElement(driver, xpath_logging);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Game Logging is matching");
        	}
    		
    		break;
        case "NumberGameCurrentVersion":
    		
    		ClickElement(driver, xpath_currentversion);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Current Version is matching");
        	}
    		
    		break;
        case "xpath_builds":
    		
    		ClickElement(driver, xpath_builds);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Builds is matching");
        	}
    		
    		break;
        case "NumberGameDocuments":
    		
    		ClickElement(driver, xpath_documents);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Documents is matching");
        	}
    		
    		break;
        case "NumberGameObliqueTesting":
    		
    		ClickElement(driver, xpath_obliquetesting);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Oblique Testing is matching");
        	}
    		
    		break;
        case "NumberGameProjectBalto":
    		
    		ClickElement(driver, xpath_projectbalto);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Project Balto is matching");
        	}
    		
    		break;
        case "NumberGameProjectGlinda":
    		
    		ClickElement(driver, xpath_projectglinda);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Project Glinda is matching");
        	}
    		
    		break;
        case "NumberGameTheColony":
    		
    		ClickElement(driver, xpath_thecolony);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for The Colony is matching");
        	}
    		
    		break;
        case "NumberGameThePlanDashboard":
    		
    		ClickElement(driver, xpath_testplandashboard);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Test Plan Dashboard is matching");
        	}
    		
    		break;
        case "NumberGameBasicCalculator":
    		
    		//String number1 = driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
        	String homepageconfirm = "N";
        	ClickElement(driver, xpath_basiccalculator);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Basic Calculator is matching");
        	}
    		Thread.sleep(2000);
    		System.out.print("Inside Calculator");
    	//	driver.findElement(By.xpath(xpath_first_number)).sendKeys(data.get("FirstNum"));
    		//driver.findElement(By.xpath(xpath_first_number)).clear();
	        //driver.findElement(By.xpath(xpath_second_number)).sendKeys(data.get("SecondNum")); 
    		HomePage_Objects hp=new  HomePage_Objects(driver, data);
    		String singleexpectedval = "";
    		for (int i=0; i<numericoperations.length;i++){
    			
    			for (int j=0; j<expectedreturnvalue.length;j++){
    				
    				singleexpectedval = expectedreturnvalue[j];
    				System.out.println("Sring Value : "+numericoperations[i]);
    				//hp.bascalcultor(numericoperations[i], expectedreturnvalue[j], homepageconfirm);
    				//hp.bascalcultornew(numericoperations[i], firstnumber, secondnumber, expectedreturnvalue[j]);
    			}
    			
    			hp.bascalcultor(numericoperations[i], expectedreturnvalue[i], homepageconfirm);
    		//	hp.bascalcultornew(numericoperations[i], firstnumber, secondnumber, expectedreturnvalue[i],"numbergame");
    			System.out.println("Sring Value : "+numericoperations[i]);
    			
    			//hp.bascalcultor(data.get("Calculation"));
    			//hp.bascalcultor(numericoperations[i]);
    		}
    		//HomePage_Objects hp=new  HomePage_Objects(driver, data);
    		System.out.print("Inside1 Calculator");
    		//hp.bascalcultor(data.get("Calculation"));
    		System.out.print("Outside Calculator");
    		
    		break;
        case "NumberGameMinimumViablePanther":
    		
    		ClickElement(driver, xpath_minimumviablepanther);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Minimum Viable Panther is matching");
        	}
    		
    		break;
        case "NumberGameMinimumViableCalculator":
    		
    		ClickElement(driver, xpath_minimumviablecalculator);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Minimum Viable Calculator is matching");
        	}
    		
    		break;
        case "NumberGameVideo":
    		
    		ClickElement(driver, xpath_video);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Video is matching");
        	}
    		
    		break;
        case "NumberGameWriting":
    		
    		ClickElement(driver, xpath_writing);
    		Thread.sleep(3000);
    		System.out.println(driver.getCurrentUrl());
    		System.out.println("Expected Url :"+expectedurl);
    		System.out.println("Actual Url :"+actualurl);
    		System.out.println("Url comparision Value : "+compurlval);
    		if (compurlval == 0) {
        		System.out.println("Url for Writing is matching");
        	}
    		
    		break;
        case "NumberGameContentTesting":
    		
        	WebElement element = driver.findElement(By.xpath("//h2[contains(text(), 'The Number Guessing Game')]"));
        	String text1 = element.getText();
        	System.out.println("contents : "+text1);
        	System.out.println("Expected URL : "+expectedurl);
        	if (text1.equals(expectedurl)){
        		System.out.println("Contents are matching");
        	}
        	else {
        		System.out.println("Contents are not matching");
        	}
    		
    		break;
    	}
     

	}
    	
    	
    	
    }
    	
//}
