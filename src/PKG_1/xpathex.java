package PKG_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']//following::input[1]")).sendKeys("ram");//following xpath
		String ids=driver.findElement(By.xpath("//input[@name='firstname']//ancestor::div[1]/input")).getAttribute("name");//ancestor xpath
		System.out.println(ids);
		driver.findElement(By.xpath("//div[@id='reg_form_box']/child::div[10]/button")).click();//child xpath
		
		
		//*[contains(@name,'button')]
		//*[contains(text(),'here')]
		//*[@name='button' or @id='pi']
		//*[@name='button' and @id='pi']
		//*[starts-with(text(),'mess')]
		//*starts-with(@id,'mess')]
		//*[text()='userid']
		//driver.manage().implicitlyWait(TimeOut,TimeUnit.SECONDS)
		//WebDriverWait w=new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/a"))).click();
		//driver.switchTo.alert().accept();
		//driver.switchTo.alert.getText();
		//driver.switchTo.alert.dismiss();
		//driver.switchTo.alert.sendKeys("hello");
		//Alert al=driver.switchTo.alert();
		//String s=al.getText();
		//print s
		//al.dismiss();
		
		


	}

}
