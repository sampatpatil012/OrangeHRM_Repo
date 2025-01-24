package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.WebElementHelper;

public class login_Page extends BaseClass {

	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;

	@FindBy(xpath = "//input[@name='password']/parent::div/following-sibling::span")
	private WebElement passwordErrorMessage;
	
	@FindBy(xpath = "//input[@name='username']/parent::div/following-sibling::span")
	private WebElement usernameErrorMessage;


	public login_Page() {

		PageFactory.initElements(getDriver(), this);
	}

	public void enterUsername(String userName) {
		WebElementHelper.sendKeys(username, userName);
	}
	
	
	public void enterPassword(String pass) {
		WebElementHelper.sendKeys(password, pass);
	}

	public void clickonLoginButton() {
		WebElementHelper.click(loginbutton);
	}
	
	public String passwordErrorMessage() {
		return WebElementHelper.getText(passwordErrorMessage);
	}
	
	public String userNameErrorMessage() {
		return WebElementHelper.getText(usernameErrorMessage);
	}
	

}
