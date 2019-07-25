package WebDriverDay2Exercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercises234 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//step1
		driver.get("http://examples.codecharge.com/store//default.php");
		WebElement w=driver.findElement(By.name("category_id"));
		Select s=new Select(w);
		int size=s.getOptions().size();
		//int size2=driver.findElements(By.name("category_id")).size();
		//List<WebElement> ar=driver.findElements(By.name("category_id"));
		System.out.println("total values in the search combo box = "+" "+size);
		s.selectByVisibleText("Databases");
		driver.findElement(By.name("DoSearch")).click();
		Thread.sleep(300);
		driver.findElement(By.linkText("Web Database Development")).click();
		//int defaultQvalue=
		WebElement q=driver.findElement(By.name("quantity"));
		q.getAttribute("value");//it will give the value of attributes(like name,id,value etc) which will be mentioned in the getAttribute method as parameter
		//It returns current value of given attribute of HTML element in form of String.
		String qt=q.getAttribute("value");
		System.out.println("quantity ="+"  "+qt);

		driver.findElement(By.name("Insert1")).click();
		WebElement dc=driver.findElement(By.name("Delete1_1"));
		if(dc.isSelected())
		{
			System.out.println("Delete checkbox is off now");
		}
		else
		{
			System.out.println("Delete checkbox is off now");
		}

		dc.click();
		System.out.println("Delete checkbox is currently on now");

		driver.close();


	}

}
