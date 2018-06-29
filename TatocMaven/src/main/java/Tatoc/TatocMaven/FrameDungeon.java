package Tatoc.TatocMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameDungeon {

	public boolean Select_FrameDungeon(WebDriver driver)
	{
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#main")));
		String Box1=driver.findElement(By.cssSelector("div#answer")).getAttribute("class");
		//System.out.println(Box1);
		driver.switchTo().frame(driver.findElement(By.id("child")));
		String Box2=driver.findElement(By.cssSelector("div#answer")).getAttribute("class");
		//System.out.println(Box2);
		while(!(Box1.equals(Box2)))
		{
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("main")));
			driver.findElement(By.cssSelector("a[onclick='reloadChildFrame();']")).click();
			driver.switchTo().frame(driver.findElement(By.id("child")));
			Box2=driver.findElement(By.cssSelector("div#answer")).getAttribute("class");
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.id("main")));
		driver.findElement(By.cssSelector("a[onclick='gonext();']")).click(); 
		String exp_url="http://10.0.1.86/tatoc/basic/drag";
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url))
		{
			return true;
		}
		else
			return false;
	}
}
