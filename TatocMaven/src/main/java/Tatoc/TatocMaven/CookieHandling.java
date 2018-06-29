package Tatoc.TatocMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieHandling {

	public boolean Select_CookieHandling(WebDriver driver)
	{
		driver.findElement(By.cssSelector("a[onclick='generateToken();']")).click();
		String Token=driver.findElement(By.cssSelector("span[id='token']")).getText();
		String Tokenvalue=Token.substring(7);
		Cookie cookie=new Cookie("Token",Tokenvalue);
		driver.manage().addCookie(cookie);
		driver.findElement(By.cssSelector("a[onclick='gonext();']")).click();
		String exp_url="http://10.0.1.86/tatoc/end";
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url))
		{
			return true;
		}
		else
			return false;
	}
}
