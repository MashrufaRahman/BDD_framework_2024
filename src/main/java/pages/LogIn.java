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
	
	@FindBy(id = "login-link")
	WebElement loginButton;

	@FindBy(id="emails")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(css = "input.btn.btn-lg.px-5")
	WebElement login;
	
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;

	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enrollNow;
	

	public void validateLogoAndTitle() {
		elementDisplayed(logo);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
	}
	public void validationLoginButton() {
		elementEnabled(loginButton);
		clickElement(loginButton);
	}
	public void validateEmail() {
		elementDisplayed(email);
		inputText(email, "kaylith1@gmail.com");
		pause(3000);
	}
	
	public void validatePassword() {
		elementDisplayed(password);
		inputText(password, "Abc12345%");
		pause(3000);
	}
	
	public void validateLogin() {
		elementEnabled(login);
		verifyTextOfTheWebElement(login, "Log in");
		clickElement(login);
		pause(3000);
	}
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
	
	/*
	public void landingOnMultiFactorAuthentication() {
		verifyTitle(driver, "Entrhall It Dasboard ");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		validationOfHeader(, "Multi-factor Authentication");
		pause(3000);
	}
	*/
	
	
	


}
