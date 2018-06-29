package Tatoc.TatocMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GridGate {

	public boolean Select_GridGate(WebDriver driver)
	{
		driver.findElement(By.cssSelector("div.greenbox")).click();
		String exp_url="http://10.0.1.86/tatoc/basic/frame/dungeon";
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url))
		{
			return true;
		}
		else
			return false;
	}
}
