package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		WebDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		/*float f1=23;
		float f2=1.23f;
		float f3=1.2e+2f;*/
	
		
		WebElement wb=driver.findElement(By.name("userName"));
		WebElement ln=driver.findElement(By.name("password"));
		/*wb.sendKeys("a");
		String s=wb.getAttribute("name");
		Actions a=new Actions(driver);
		Action w=a.sendKeys(s, Keys.CONTROL).build();
		w.perform();*/
		//wb.sendKeys("a");
		/*String u="hello";
		wb.sendKeys(u.toUpperCase());
		wb.sendKeys(Keys.CONTROL,"a");
		wb.sendKeys(Keys.CONTROL,"c");
		ln.sendKeys(Keys.CONTROL,"v");*/
		Actions m=new Actions(driver);
		m.moveToElement(ln).click().sendKeys("hello").build().perform();
		
		

	}

}
