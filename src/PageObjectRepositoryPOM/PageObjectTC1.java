package PageObjectRepositoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		homePage home=new homePage(driver);
		home.loginclick();
		loginPage loin=new loginPage(driver);
		loin.enterusername("cvenkata_raman@rediffmail.com");
		loin.enterpassword("satyam123$");
		loin.submit();
		logoutPage lout=new logoutPage (driver);
		lout.clicklogout();
		
		

	}

}
