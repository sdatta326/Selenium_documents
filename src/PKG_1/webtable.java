package PKG_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		String textvalue=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[1]")).getText();
		System.out.println(textvalue);
		
		String xp;
		String txt;
		
		
		for(int r=2;r<=7;r++)
		{
			for(int c=1;c<=3;c++)
			{
				xp="//*[@id='customers']/tbody/tr["+r+"]/td["+c+"]";
				txt=driver.findElement(By.xpath(xp)).getText();
				System.out.print(txt+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
