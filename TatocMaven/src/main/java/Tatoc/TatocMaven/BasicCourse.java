package Tatoc.TatocMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicCourse {

	public boolean Select_BasicCourse(WebDriver driver)
	{
		driver.findElement(By.cssSelector("a[href='/tatoc/basic']")).click();
		String exp_url="http://10.0.1.86/tatoc/basic/grid/gate";
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url))
			return true;
		else 
			return false;
	}
}
