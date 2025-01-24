package StepDefinition;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.homePage;
import io.cucumber.java.en.Then;

public class TC002_HomePage_Step extends BaseClass {

	homePage home;

	@Then("user should validate logo")
	public void user_should_validate_logo() {

		home = new homePage();
         System.out.println(home.validateLogo());
		Assert.assertEquals(home.validateLogo(), true);
	}

}
