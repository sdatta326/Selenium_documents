package PKG_1;

import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class Screenshot {
	
	static WebDriver driver;
	static int i=1;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe




		 driver= new ChromeDriver();


		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		WebElement login;
		login = driver.findElement(By.linkText("Log in"));
		getScreenshot();
		login.click();
		getScreenshot();
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("sampleemail@gmail.com");
		getScreenshot();
		 Thread.sleep(5000);
	        driver.close();
	        
	    }
	    public static void getScreenshot() throws IOException
	    {
	        File scrFile;
	        scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        Files.copy(scrFile, new File("c:\\screens\\steps" + i + ".png"));
	        i++;
	    }
}






























	



