package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Step extends BaseClass {

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
			//login.captureErrorMessage();
			Assert.assertEquals(login.passwordErrorMessage(), "Required");
			//System.out.println(login.userNameErrorMessage());
	}
	
	
	@Given("user should enter password as {string}")
	public void user_should_enter_password_as(String Password) {
		login.enterPassword(Password);
		
	 
	}
	@Then("user should validate usernameErrorMessage")
	public void user_should_validate_username_error_message() {

		Assert.assertEquals(login.userNameErrorMessage(), "Required");
	}
}
