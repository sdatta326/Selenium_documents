package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("ram");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("sen");
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("newuname");
		
		String mtext=driver.findElement(By.xpath("//font[contains(text(),'Mailing')]")).getText();
		System.out.println(mtext);*/
		
		//driver.findElement(By.xpath("//input[starts-with(@name,'userN')]")).sendKeys("ap@gmail.com");
		
		//driver.findElement(By.cssSelector("td.mouseOut")).click();wrong for having multiple element
		
		String t2=driver.findElement(By.xpath("//font[contains(text(),'Mailing')]")).getText();
		System.out.println(t2);
		
		
		
		//driver.findElement(By.xpath("//input[@name='address1' and @size='40']")).sendKeys("delhi");//with same input two diff property have to be same
		
		//driver.findElement(By.xpath("//input[@name='address1' and @size='40']")).sendKeys("delhi");
		//driver.findElement(By.xpath("//input[@name='city' or size='15']")).sendKeys("mujanagar");
		
		
		/*driver.findElement(By.xpath("//input[@name='email']//following::input[3]")).click();*/

	}

}
