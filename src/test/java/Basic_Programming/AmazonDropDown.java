package Basic_Programming;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDropDown {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dd);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByValue("search-alias=baby");
		Thread.sleep(3000);
		s.selectByVisibleText("Car & Motorbike");
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();
		System.out.println(options.size());
		for( WebElement opt:options)
		{
			System.out.println(opt.getText());
		}
	
	}

}
