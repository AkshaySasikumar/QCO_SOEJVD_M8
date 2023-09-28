package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {
	

	@FindBy(xpath="//a[text()='COURSE']")
	private WebElement courseEle;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement SeleniumTrainingEle;
	
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCourseEle() {
		return courseEle;
	}
	
	public void seleniumTraining() {
		SeleniumTrainingEle.click();
	}
}
