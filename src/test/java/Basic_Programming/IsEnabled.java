package Basic_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsEnabled {
	public static void main(String[] args)  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd1234");
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		if(btn.isEnabled())
		{
			System.out.println("entered to if block");
			btn.click();
		}
		else
		{
			System.out.println("enterd to else block");
		}
	}

}
