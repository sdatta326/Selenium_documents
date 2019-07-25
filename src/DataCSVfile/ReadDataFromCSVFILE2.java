package DataCSVfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromCSVFILE2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse Workspace\\chromedriver.exe");//right path of chrome driver.exe

		WebDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		String datafile = "c:/output/mercuryregister_testdata.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        br = new BufferedReader(new FileReader(datafile));
        while ((line = br.readLine()) != null) 
        {
                    String[] data = line.split(cvsSplitBy);
                   
                    
                    driver.findElement(By.linkText("REGISTER")).click();
                    Thread.sleep(3000);
                    driver.findElement(By.name("firstName")).sendKeys(data[0]);
                    driver.findElement(By.name("lastName")).sendKeys(data[1]);
                    driver.findElement(By.name("email")).sendKeys(data[2]);
                    driver.findElement(By.linkText("Home")).click();
                    
                    System.out.print(data[0]+" ");
                    System.out.print(data[1]+" ");
                    System.out.print(data[2]+" ");
                    
                    System.out.println();
                    //System.out.println(data[0] + data[1]);
                    
        }


	}

}
