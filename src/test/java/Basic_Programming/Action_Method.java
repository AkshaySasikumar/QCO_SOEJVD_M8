package Basic_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Method {
	public static void main(String[] args) throws Throwable  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		 WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		ele.sendKeys("abcd");
		Thread.sleep(3000);
		ele.clear();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Point coordinate = ele.getLocation();
		int x=coordinate.getX();
		int y=coordinate.getY();
		System.out.println(x);
		System.out.println(y);
	}
}
