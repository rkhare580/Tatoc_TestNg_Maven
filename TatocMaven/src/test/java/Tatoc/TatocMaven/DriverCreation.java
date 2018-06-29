package Tatoc.TatocMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverCreation {

	static WebDriver driver;
	@BeforeClass
	public void Launch_Tatoc()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohitkhare\\eclipse-workspace\\TatocMaven\\Chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		
	}
	@AfterClass
	public void Close_Tatoc()
	{
		//sdriver.close();
	}
}
