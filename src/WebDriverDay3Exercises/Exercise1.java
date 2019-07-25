package WebDriverDay3Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		WebDriver driver= new ChromeDriver();
		driver.get("https://html.com/tables/#Table_Code_Sample_Sample_Table");
		driver.manage().window().maximize();
		
		String s1=driver.findElement(By.xpath("//div[@class=\"render\"]/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(s1);
		String xp;
		//String xp=driver.findElement(By.xpath("//div[@class=\"render\"]/table/tbody/tr["+2+"]/td["+1+"]")).getText();
		//System.out.println(xp);
		int r=2;
		int c=1;
		String txt;
		int count=driver.findElements(By.xpath("//div[@class='post-single clearfix']/div[3]/table/tbody/tr")).size();//not printing right rows
		//div[@class='post-single clearfix']/div[3]/table/tbody/tr
		System.out.println(count-1);
		for(r=2;r<=3;r++)
		{
			
			for(c=1;c<=2;c++)
			{
				xp="//div[@class='post-single clearfix']/div[3]/table/tbody/tr["+r+"]/td["+c+"]";
				txt=driver.findElement(By.xpath(xp)).getText();
				System.out.print(txt+" ");
				
			}
			System.out.println();
			
		}
		
	}

}
