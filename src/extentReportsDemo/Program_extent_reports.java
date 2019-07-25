package extentReportsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Program_extent_reports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ExtentReports extent;
		ExtentTest test;

		extent = new ExtentReports("c:/OUTPUT/testresult123.html", true);

		test = extent.startTest("test1");

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();

		test.log(LogStatus.PASS, "Browser opened successfully...");
		test.log(LogStatus.PASS, "App has been opened...");
		test.log(LogStatus.PASS, "Login has been clicked...");
		extent.endTest(test);

		test = extent.startTest("test2");
		test.log(LogStatus.PASS, "Register has been clicked");
		extent.endTest(test);
		extent.flush();
		extent.close();
	}

}
