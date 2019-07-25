package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver;
	WebElement username,pwd,sub;
	
	loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	void enterusername(String e)
	{
		username=driver.findElement(By.id("Email"));
		username.sendKeys(e);
		
	}
	
	void enterpassword(String p)
	{
		pwd=driver.findElement(By.id("Password"));
		pwd.sendKeys(p);

	}

	
	void submit()
	{
		sub=driver.findElement(By.xpath("//input[@value='Log in']"));
		sub.click();
	}
}
