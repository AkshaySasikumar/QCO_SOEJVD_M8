package Basic_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class get_Size {
	public static void main(String[] args)   {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		Dimension dimension = ele.getSize();
		int h=dimension.getHeight();
		int w=dimension.getWidth();
		System.out.println(h);
		System.out.println(w);	 
	}
}
