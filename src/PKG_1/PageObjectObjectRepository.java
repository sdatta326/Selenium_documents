package PKG_1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectObjectRepository  {

	public static void main(String[] args) throws IOException{


		WebDriver driver;           
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\IBM Upskill program\\Selenium setup files\\Chrome driver 74\\chromedriver_win32\\chromedriver.exe");      
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
		driver = new ChromeDriver();                    
		driver.get("http://demowebshop.tricentis.com");                    
		Properties obj = new Properties();                    
		FileInputStream objfile = new FileInputStream("C:\\Selenium\\First_Selenium_Training\\src\\webelement_testdata.properties");                                    
		obj.load(objfile);                    
		driver.findElement(By.linkText(obj.getProperty("login"))).click();                            
		driver.findElement(By.name(obj.getProperty("username"))).sendKeys("contactvenkataraman@gmail.com");                                    
		driver.findElement(By.name(obj.getProperty("password"))).sendKeys("sample123$");  
		String uname=driver.findElement(By.name(obj.getProperty("username"))).getAttribute("value");
		//String pwd=driver.findElement(By.name(obj.getProperty("password"));
		String pwd=driver.findElement(By.name(obj.getProperty("password"))).getAttribute("value");
		System.out.println(uname);
		System.out.println(pwd);
		
		

	}  


}


