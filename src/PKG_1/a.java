package PKG_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class a {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		


		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String t=driver.getTitle();
		System.out.println(t);
	
		String v=driver.getTitle();
		System.out.println(v);
		String txt=driver.findElement(By.tagName("title")).getText();
		System.out.println(txt);
		driver.findElement(By.id("email")).sendKeys("a@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");
		
		

		//*[@id="u_0_3"]
		//driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		//driver.findElement(By.name("sex")).click();
		WebElement r=driver.findElement(By.xpath("//input[@name='sex']"));
		r.click();
		
			System.out.println(r.isSelected());
		
		r.click();
		
		System.out.println(r.isSelected());
		
		List<WebElement> arl=driver.findElements(By.xpath("//input[@name='sex']//following-sibling::label"));
		
	for(int i=0;i<arl.size();i++)
	{
		System.out.println(arl.get(i).getText());
	}

		



	}

}
