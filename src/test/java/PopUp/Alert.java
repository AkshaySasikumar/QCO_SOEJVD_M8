package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training ");
		WebElement plus = driver.findElement(By.id("add"));
		Actions a=new Actions(driver);
		a.doubleClick(plus).perform();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		Thread.sleep(3000);
		org.openqa.selenium.Alert popup = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(popup.getText());
		popup.dismiss();
		driver.close();
		
	}

}
