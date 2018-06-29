package Tatoc.TatocMaven;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopupWindow {

	public boolean Select_PopupWindow(WebDriver driver)
	{
		System.out.println("*******");
		driver.findElement(By.cssSelector("a[onclick='launchwindow();']")).click();
		System.out.println("*******");
		ArrayList<String> tabs=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.cssSelector("input#name")).sendKeys("Rohit");
		driver.findElement(By.cssSelector("input#submit")).click();
	    driver.switchTo().window(tabs.get(0));
		driver.findElement(By.cssSelector("a[onclick='gonext();']")).click();
		String exp_url="http://10.0.1.86/tatoc/basic/cookie";
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url))
		{
			return true;
		}
		else
			return false;
	}
}
