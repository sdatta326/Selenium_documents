package javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePageTitle {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   
	        
	    	System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
	        
	        driver = new ChromeDriver();
	        driver.get("http://www.newtours.demoaut.com");
	        String x= getTitle(driver);
	        System.out.println(x);    
	        driver.close();
	    }
	    public static String getTitle(WebDriver driver)
	    {

	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
	         String title = js.executeScript("return document.title;").toString();
	         return title;
	     }

	   

	}
	


