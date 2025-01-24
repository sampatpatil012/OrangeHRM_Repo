package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_login_Step extends BaseClass {

	private static login_Page login;

	@Given("user should enter username as {string}")
	public void user_should_enter_username_as(String UserName) {
		login = new login_Page();
		login.enterUsername(UserName);
	}

	@When("user click on Login button")
	public void user_click_on_login_button() {
		login.clickonLoginButton();
	}

	@Then("user should validate passwordErrorMessage")
	public void user_should_validate_password_error_message() {
		// login.captureErrorMessage();
		Assert.assertEquals(login.passwordErrorMessage(), "Required");
		// System.out.println(login.userNameErrorMessage());
	}

	@Given("user should enter password as {string}")
	public void user_should_enter_password_as(String Password) {
		login.enterPassword(Password);

	}

	@Then("user should validate usernameErrorMessage")
	public void user_should_validate_username_error_message() {

		Assert.assertEquals(login.userNameErrorMessage(), "Required");
	}

	@Then("user should validate credentialsErrorMessage")
	public void user_should_validate_credentials_error_message() {

		Assert.assertEquals(login.credErrorMessage(), "Invalid credentials");
	}

	@Then("user should navigate to homepage and validate the title as {string}")
	public void user_should_navigate_to_homepage_and_validate_the_title_as(String title) {
		Assert.assertEquals(getDriver().getTitle(), title);
		
		
		
	}

}
