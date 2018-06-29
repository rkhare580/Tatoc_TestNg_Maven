package Tatoc.TatocMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public boolean Select_DragNDrop(WebDriver driver) 
	{
		WebElement Frm=driver.findElement(By.cssSelector("div#dragbox"));
		WebElement To=driver.findElement(By.cssSelector("div#dropbox"));
		Actions DrgNDrp=new Actions(driver);
		DrgNDrp.dragAndDrop(Frm,To).build().perform();
		driver.findElement(By.cssSelector("a[href='#']")).click();
		String exp_url="http://10.0.1.86/tatoc/basic/windows";
		String act_url=driver.getCurrentUrl();
		if(exp_url.equals(act_url))
		{
			return true;
		}
		else
			return false;
		
	}
}
