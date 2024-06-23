package pageobjects;

import java.util.HashMap;

import basepage.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WritingPage_Objects extends BaseClass {
	private static final String Return = null;
	/*
	
	public String xpath_moreagiletesting = "(//div[@class='row'])[1]";
	public String xpath_howtest = "(//div[@class='row'])[2]";
	public String xpath_theelfhowtotest = "(//div[@class='row'])[3]";
	public String xpath_obliquetesting = "(//div[@class='row'])[4]";
	
	*/
	
	public String xpath_moreagiletesting = "//img[@src='img/agile testing.JPG']";
	public String xpath_howtest = "//img[@src='img/howtotest.JPG']";
	public String xpath_theelfhowtotest = "//img[@src='img/theelf.JPG']";
	public String xpath_obliquetesting = "//img[@src='img/obliquetesting.JPG']";
	public String xpath_softwareminefield = "//img[@src='img/minefield.JPG']";
	public String xpath_testSheepnz = "//img[@src='img/blogspot.JPG']";
	public String xpath_miketalks = "//img[@src='img/medium.JPG']";
	public String xpath_melodyharper = "//img[@src='img/melody.JPG']";
	
	HashMap<String,String> data=new HashMap<String, String>();

    WebDriver driver;

    public WritingPage_Objects(WebDriver driver,HashMap<String,String> data){
        this.driver=driver;
        this.data=data;
    }

	public void click_writingpagemenu() throws InterruptedException{
		
		String menutobeclicked=data.get("Menu");
    	String expectedurl=data.get("Expectedurl");
    	//String actualurl = driver.getCurrentUrl();
    	
    	System.out.println("Print expectedurl : "+expectedurl);
    	//System.out.println("Print actualurl : "+actualurl);
    	
        //int compurlval = expectedurl.compareTo(actualurl);
    	
    	System.out.println("Menu to be clicked :"+menutobeclicked);
    	
    	switch(menutobeclicked){
    	
    	case "moreagiletesting":
    		ClickElement(driver, xpath_moreagiletesting);
    		Thread.sleep(3000);
    		String actualurl = driver.getCurrentUrl();
    		int compurlval = expectedurl.compareTo(actualurl);
    		if (compurlval == 0){
    			System.out.println("The link of More Agile testing is matching");
    		}
    		driver.navigate().back();
    		break;
    	case "howtotest":
    		System.out.println("Inside how to test");
    		ClickElement(driver, xpath_howtest);
    		Thread.sleep(3000);
    		String actualurl1 = driver.getCurrentUrl();
            int compurlval1 = expectedurl.compareTo(actualurl1);
    		System.out.println("Outside how to test");
    		System.out.println("Print compurlval : "+compurlval1);
    		if (compurlval1 == 0){
    			System.out.println("The link of How to testing is matching");
    		}
    		//driver.navigate().back();
    		break;
    	case "eifwholearned":
    		ClickElement(driver, xpath_theelfhowtotest);
    		Thread.sleep(3000);
    		String actualurl2 = driver.getCurrentUrl();
            int compurlval2 = expectedurl.compareTo(actualurl2);
    		System.out.println("Outside how to test");
    		System.out.println("Print compurlval : "+compurlval2);
    		if (compurlval2 == 0){
    			System.out.println("The link of EIF How to testing is matching");
    		}
    		driver.navigate().back();
    		break;
    	case "obliquetesting":
    		ClickElement(driver, xpath_obliquetesting);
    		Thread.sleep(3000);
    		String actualurl3 = driver.getCurrentUrl();
            int compurlval3 = expectedurl.compareTo(actualurl3);
    		if (compurlval3 == 0){
    			System.out.println("The link of Oblique testing is matching");
    		}
    		driver.navigate().back();
    		break;
    	case "thesoftwareminefiled":
    		
    		ClickElement(driver, xpath_softwareminefield);
    		Thread.sleep(3000);
    		String actualurl4 = driver.getCurrentUrl();
            int compurlval4 = expectedurl.compareTo(actualurl4);
            
    		//driver.findElement(By.xpath("//a[@href='https://leanpub.com/TheSoftwareMinefield'")).click();
    		//Thread.sleep(3000);
    		if (compurlval4 == 0){
    			System.out.println("The link of Oblique testing is matching");
    		}
    		driver.navigate().back();
    		break;
    	case "testsheepnz":
    		//driver.findElement(By.xpath("//a[@href='https://testsheepnz.blogspot.com/'")).click();
    		ClickElement(driver, xpath_testSheepnz);
    		Thread.sleep(3000);
    		String actualurl5 = driver.getCurrentUrl();
            int compurlval5 = expectedurl.compareTo(actualurl5);
    		//Thread.sleep(3000);
    		if (compurlval5 == 0){
    			System.out.println("The link of Oblique testing is matching");
    		}
    		driver.navigate().back();
    		break;
    	case "miketalks":
    		//driver.findElement(By.xpath("//a[@href='https://medium.com/@MikeTalks'")).click();
    		//Thread.sleep(3000);
    		ClickElement(driver, xpath_miketalks);
    		Thread.sleep(3000);
    		String actualurl6 = driver.getCurrentUrl();
            int compurlval6 = expectedurl.compareTo(actualurl6);
    		if (compurlval6 == 0){
    			System.out.println("The link of Oblique testing is matching");
    		}
    		driver.navigate().back();
    		break;
    	case "melodyharpersmoon":
    		//driver.findElement(By.xpath("//a[@href='https://www.amazon.com/Melody-Harpers-Moon-Meike-Torkelson-ebook/dp/B07GTYY3NL'")).click();
    		//Thread.sleep(3000);
    		String actualurl7 = driver.getCurrentUrl();
            int compurlval7 = expectedurl.compareTo(actualurl7);
    		ClickElement(driver, xpath_melodyharper);
    		Thread.sleep(3000);
    		//String actualurl7 = driver.getCurrentUrl();
    		if (compurlval7 == 0){
    			System.out.println("The link of Oblique testing is matching");
    		}
    		driver.navigate().back();
    		break;
    	}
    	
	}

}
