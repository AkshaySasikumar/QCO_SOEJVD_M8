package TestNg_Groups;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups="smoke")
	public void sam2_1()
	{
		System.out.println("java");
	}
	
	@Test
	public void sam2_2()
	{
		System.out.println("selenium");
	}
	


}
