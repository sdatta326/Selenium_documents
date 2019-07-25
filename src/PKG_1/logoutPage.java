package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class logoutPage {
	
	WebDriver driver;
	WebElement lout;
	
	logoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	void clicklogout()
	{
		lout=driver.findElement(By.linkText("Log out"));
		lout.click();
	}

}
