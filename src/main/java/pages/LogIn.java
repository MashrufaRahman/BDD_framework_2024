	package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class LogIn {

	WebDriver driver;
		public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath = "//img//parent::a//parent::nav")
	WebElement logo;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement logInFromToolbar;
	
	@FindBy(id="emails")
	WebElement email;
	
	@FindBy(id="emails")
	WebElement userId;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	//@FindBy(css = "input.btn.btn-lg.px-5")
	//WebElement login;
	@FindBy(xpath = "//input[@id='login']")
	WebElement loginButton;
	
	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement dashbord;
	/*
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;

	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enrollNow;
	*/

	public void validateLogoAndTitle() {
		//verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/?next=/");
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
	}
	public void validationLoginButton() {
		//elementEnabled(logInFromToolbar);
		clickElement(logInFromToolbar);
	}
	public void navigatedToLoginPage() {
		pause(3000);
		verifyTitle(driver, "Enthrall IT");
		//verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");

	}
	public void validateEmail() {
		inputText(email, "kaylith1@gmail.com");
		pause(3000);
	}
	
	public void validatePassword() {
		//elementDisplayed(password);
		inputText(password, "Abc12345%");
		pause(3000);
	}
	
	public void validateuserId(String string) {
		//elementDisplayed(email);
		inputText(userId, string);
		pause(4000);
	}
	
	public void validatePassword(String string) {
		elementDisplayed(password);
		inputText(password, string);
		pause(6000);
	}
	
	public void validateLogin() {
		elementEnabled(loginButton);
		//verifyTextOfTheWebElement(loginButton, "LogIn ");
		clickElement(loginButton);
		pause(3000);
	}
	
//	public void landingOnEnthrallItDashbord() {
//		verifyTitle(driver, "Entrhall It Dasboard");
//		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
//		validationOfHeader(dashbord, "Dashbord");
//		pause(3000);
//	}
/*
	public void validateAutomation() {
		elementEnabled(automation);
		clickElement(automation);
		pause(4000);
	}
	public void validateEnrollNow() {
		elementEnabled(enrollNow);;
		clickElement(enrollNow);
		pause(4000);
	}
	
	
	*/


}
