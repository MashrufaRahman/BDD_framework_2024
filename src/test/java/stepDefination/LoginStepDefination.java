package stepDefination;

import baseUtil_7_26_2024.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination extends BaseClass {
	
	@Given("User is on the Enthrall IT homepage URL")
	public void user_is_on_the_enthrall_it_homepage_url() {
	    logIn.validateLogoAndTitle();
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() {
	    logIn.validationLoginButton();
	}

	@Then("User will be navigated to Login Page")
	public void user_will_be_navigated_to_login_page() {
	   logIn.navigatedToLoginPage();
	    
	}

	@When("User enter Email in the Email field")
	public void user_enter_email_in_the_email_field() {
	    logIn.validateEmail();
	}

	@When("User enter Password in the Password field")
	public void user_enter_password_in_the_password_field() {
	    logIn.validatePassword();
	}

	@When("User finally click on Login Button")
	public void user_finally_click_on_login_button() {
	    logIn.validateLogin();
	}

	

}
