package stepDefination;

import baseUtil.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import pages.NewUserEnrollment;

public class NewUserEnrollmentStepDefination extends BaseClass {

	@Given("user is on the EnthrallIt Home portal page URL")
	public void user_is_on_the_enthrall_it_home_portal_page_url() {
		newUserEnrollment.validateLogoAndTitle();   
	}
//new section
@When("user click the login Button and put the credential")
public void user_click_the_login_button_and_put_the_credential() {
	newUserEnrollment.clickLoginButton();
}

@Then("user nevigate to the dashboard")
public void user_nevigate_to_the_dashboard() {
   newUserEnrollment.landingOnEnthrallItDashbord();
}

@When("User click on Automation")
public void user_click_on_automation() {
    newUserEnrollment.clickAutomationButton();
}

@Then("User navigate to EnrollNow Automation page")
public void user_navigate_to_enroll_now_automation_page() {
    newUserEnrollment.landingOnAutomationPage();
}

@When("User click on EnrollNow")
public void user_click_on_enroll_now() {
    newUserEnrollment.clickEnrollNowPage();
}

//@Then("User navigate to EnrollHome Application page")
//public void user_navigate_to_enroll_now_application_page() {
//    newUserEnrollment.validationEnrollHomePage();
//}
@Then("User navigate to the enrollment process and click on submit Button to sees the successful message")
public void user_navigate_to_the_enrollment_process_and_click_on_submit_button_to_sees_the_successful_message() {
    newUserEnrollment.openApplicationAndSubmitButton();
}

}
