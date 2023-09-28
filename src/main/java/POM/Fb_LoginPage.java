package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage {
	
	@FindBy(id="email")
	private WebElement emailTf;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement passwordTf;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public Fb_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void emailTextField(String name) {
		emailTf.sendKeys(name);
	}
	
	public void passwordTextField(String name) {
		passwordTf.sendKeys(name);
	}
	
	public void loginButton() {
		loginBtn.click();
	}

}
