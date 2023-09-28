package Basic_Programming;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Bike");
		Thread.sleep(5000);
		List<WebElement> value =driver.findElements(By.xpath("//li[@data-view-type='1']"));
		System.out.println(value.size());
		for( WebElement b:value)
		{
			System.out.println(b.getText());
		}
		Thread.sleep(3000);
		driver.close();
	}

}
