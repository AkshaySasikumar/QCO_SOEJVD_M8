package Basic_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
	public static void main(String[] args)  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
