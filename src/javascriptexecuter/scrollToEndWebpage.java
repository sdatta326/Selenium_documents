package javascriptexecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollToEndWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("http://www.newtours.demoaut.com");
        driver.findElement(By.linkText("REGISTER")).click();
        WebElement email =  driver.findElement(By.name("email"));
        scroll(email, driver);

	}
	public static void scroll(WebElement element, WebDriver driver)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        
    }

}
