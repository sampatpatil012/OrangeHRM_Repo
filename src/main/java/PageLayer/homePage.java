package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class homePage extends BaseClass {

	@FindBy(xpath = "//div[@class='oxd-sidepanel-body']/preceding-sibling::div")
	private  WebElement logo;

	public homePage() {

		PageFactory.initElements(getDriver(), this);
	}

	public  boolean validateLogo() {
		boolean abc=logo.isDisplayed();
		System.out.println("========================================================="+abc);
		return logo.isDisplayed();
	}
}
