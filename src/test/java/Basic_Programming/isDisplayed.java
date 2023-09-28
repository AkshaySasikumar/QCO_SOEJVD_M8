package Basic_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isDisplayed {
	public static void main(String[] args)   {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement emailTf = driver.findElement(By.xpath("//input[@name='email']"));
		if(emailTf.isDisplayed())
		{
			emailTf.sendKeys("abcd");
			System.out.println("if block");
		}
		else
		{
			System.out.println("else block");
		}
	}
}
