package Tatoc.TatocMaven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TatocMain extends DriverCreation{

	@Test(priority=1)
	public void Verify_BasicCourse_Selection()
	{
		Assert.assertTrue(new BasicCourse().Select_BasicCourse(driver));
	}
	@Test(priority=2)
	public void Verify_GridGate()
	{
		Assert.assertTrue(new GridGate().Select_GridGate(driver));
	}
	@Test(priority=3)
	public void Verify_FrameDungeon()
	{
		Assert.assertTrue(new FrameDungeon().Select_FrameDungeon(driver));
	}
	@Test(priority=4)
	public void Verify_DragNDrop()
	{
		Assert.assertTrue(new DragNDrop().Select_DragNDrop(driver));
	}
	@Test(priority=5)
	public void Verify_PopupWindow()
	{
		Assert.assertTrue(new PopupWindow().Select_PopupWindow(driver));
	}
	@Test(priority=6)
	public void Verify_CookieHandling()
	{
		Assert.assertTrue(new CookieHandling().Select_CookieHandling(driver));
	}
}
