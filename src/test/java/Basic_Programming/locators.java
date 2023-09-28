package Basic_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.name("pass")).sendKeys("abcd1234");
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		//driver.findElement(By.id("login")).click();
	}

}
