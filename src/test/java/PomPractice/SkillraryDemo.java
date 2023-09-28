package PomPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.SkillraryDemoLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillraryDemo {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
		SkillraryDemoLoginPage sd = SkillraryDemoLoginPage(driver);
		 Actions a =new Actions(driver);
		 a.moveToElement(sd.getCourseEle()).perform();
		 
		 sd.seleniumTraining();
	}

}
