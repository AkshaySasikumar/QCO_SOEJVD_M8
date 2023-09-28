package assignament;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart_WithCoordinates {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement faq = driver.findElement(By.xpath("//a[text()='FAQ']"));
		Point coOrdinates = faq.getLocation();
		int x=coOrdinates.getX();
		int y=coOrdinates.getY();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		js.executeScript("arguments[0].scrollIntoView();", faq);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", faq);
	}
}
