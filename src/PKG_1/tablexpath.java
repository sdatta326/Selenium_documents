package PKG_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		


		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		
		List<WebElement> r=driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		int rows=r.size();
		List<WebElement> c=driver.findElements(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td"));
		int cols=c.size();
		System.out.println("no of rows="+rows);
		System.out.println("no of columns="+cols);
				
			

	}

}
