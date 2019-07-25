package PKG_1;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datecombobox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		/*driver.findElement(By.linkText("REGISTER")).click();
		WebElement d=driver.findElement(By.name("country"));
		Select s=new Select(d);
		int dsize=s.getOptions().size();
		for(int i=0;i<dsize;i++)
		{
			s.selectByIndex(i);
			String t=s.getFirstSelectedOption().getText();
			System.out.println(t);
			
		}*/
		Date dt=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("MMM dd, yyyy");
	
		System.out.println("system date="+ft.format(dt));
		
		String expecteddate=ft.format(dt);
		
		System.out.println("expected date="+expecteddate);
		
		WebElement dw=driver.findElement(By.xpath("//form[@name='home']/table/tbody/tr/td//font/b"));
		String  actualcurrentwebdate=dw.getText();
		System.out.println("actual date="+actualcurrentwebdate);
		if(expecteddate.equals(actualcurrentwebdate))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail"+actualcurrentwebdate+"<>"+expecteddate);
		}
		
		
	}

}
