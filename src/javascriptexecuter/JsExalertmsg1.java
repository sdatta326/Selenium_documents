package javascriptexecuter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExalertmsg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
       // driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Javascript message box')");
        
	}

}
