package basepage;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class BaseClass {

	String name="";
	String checking="";
	  public void ClickElement(WebDriver driver,String xpath_locator){
	        driver.findElement(By.xpath(xpath_locator)).click();
	    }

	    public void setElement(WebDriver driver,String xpath_locator,String value){
	        driver.findElement(By.xpath(xpath_locator)).sendKeys(value);
	    }

	    public String getElement(WebDriver driver,String xpath_locator,String value){
	       return driver.findElement(By.xpath(xpath_locator)).getText();
	    }

	    public List<WebElement> getWebElements(WebDriver driver, String locator){


	        List<WebElement> elements=driver.findElements(By.xpath(locator));
	        return elements;
	    }


		public void TakeScreenshot(WebDriver driver) throws IOException {
			File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(screenshot,new File(name+"_screenshot.png"));
		}


		public void SetScreenshotName(String name){
		  this.name=name;
		}


}
