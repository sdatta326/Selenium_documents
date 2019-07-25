package WebDriverDay2Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//step1
		driver.get("http://demowebshop.tricentis.com/");
		String actitle=driver.getTitle();
		System.out.println("page title"+" "+actitle);
		String extitle="Demo Web Shop";
		//In general both equals() and “==” operator in Java are used to compare objects to check equality but here are some of the differences between the two:

	   // Main difference between .equals() method and == operator is that one is method and other is operator.
	    //We can use == operators for reference comparison (address comparison) and .equals() method for content comparison.
		if(actitle.equals(extitle))
		{
			System.out.println("page title pass");
		}
		else
		{
			System.out.println("page title fail");
		}
		//step2
		driver.findElement(By.linkText("Register")).click();
		
		String regextitle="Demo Web Shop. Register";
		String reactitle=driver.getTitle();
		System.out.println("Registration page title"+" "+reactitle);
		if(reactitle.equals(regextitle))
		{
			System.out.println("registration page title pass");
		}
		else
		{
			System.out.println("registration page title fail");
		}
		//step3
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("Email")).sendKeys("ababcc@gmail.com");
		driver.findElement(By.id("FirstName")).sendKeys("ram");
		driver.findElement(By.id("LastName")).sendKeys("sarkar");
		driver.findElement(By.id("Password")).sendKeys("pass1234");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass1234");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.className("ico-logout")).click();
		System.out.println("logout success");
		
		
		
		
		
	}

}
