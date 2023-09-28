package Basic_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AXo7B7V4OtgvkI_2QZtwFnc9_EcK89asOIHZTe4-2ze8Kjqlv7P6B9JAeicquLDwHWvsSUzVKUNGnw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-301545957%3A1694056947929402&theme=glif");
		driver.findElement(By.id("identifierId")).sendKeys("abcd");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
