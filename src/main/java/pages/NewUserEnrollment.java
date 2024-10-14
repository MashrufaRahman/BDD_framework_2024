package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

import java.io.File;
import java.util.List;
import java.util.Set;

public class NewUserEnrollment {

	WebDriver driver;

	private JavascriptExecutor js;

	public NewUserEnrollment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
	}

	@FindBy(xpath = "//img//parent::a//parent::nav")
	WebElement logo;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement logInFromToolbar;

	@FindBy(id = "emails")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	// @FindBy(css = "input.btn.btn-lg.px-5")
	// WebElement login;
	@FindBy(xpath = "//input[@id='login']")
	WebElement loginButton;

	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement dashboard;

	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automation;
	@FindBy(xpath = "//h1[text() = 'Enroll']")
	WebElement enrollHome;

	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enrollNow;
	@FindBy(xpath = "//h1[text()='Enroll']")
	WebElement enrollForm;
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement fName;

	@FindBy(xpath = "//input[@id='id_m_name']")
	WebElement middleName;

	// @FindBy(xpath = "//small[contains(text(), 'alphabetic')]")
	// WebElement mustBeAlphabeticCharactersErrorMessage;

	@FindBy(xpath = "//small[contains(text(), 'First Name is a required field.')]")
	WebElement firstNameIsARequiredFieldErrorMesssage;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement firstNameMustBeAlphabeticCharacterErrorMessagElement;
	// @FindBy(xpath = "//small[@id='f_name_error']")
	// WebElement firstNameMustBeAlphabeticCharactersErrorMessage;

	// @FindBy(xpath = "//input[@id='id_m_name']")
	// WebElement middleName;

	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement middleNameMustBeAlphabeticCharactersErrorMessag;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement middleNameErrorMessage;

	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lName;
	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastNameIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement lastNameMustBeAlphabeticCharactersErronMessage;

	@FindBy(xpath = "//select[@name = 'i_am']")
	WebElement iAm;
	@FindBy(xpath = "//small[@id='i_am_error']")
	WebElement iAmIsARequiredFieldErrorMessage;

	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> iAmList;

	@FindBy(xpath = "//select[@name='course_wish_to_enroll']")
	WebElement course;

	@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']")
	WebElement CourseWishToEnroll;
	@FindBy(xpath = "//small[normalize-space(text())='Course Wish to Enroll is a required field.']")
	WebElement courseWishToEnrollIsARequiredFieldErrorMessage;
	// @FindBy(xpath = "//select[@name='course_wish_to_enroll']/option")
	// List<WebElement> courseList;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phonNumber;
	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement phoneNumberIsARequirFieldErrorMessage;
	@FindBy(xpath = "//small[text()='Phone Number must be exactly 10 digits.']")
	WebElement phoneNumberMustBeExactly10DigitsErrorMessage;
	@FindBy(xpath = "//small[text()='Phone Number must be exactly 10 digits.']")
	WebElement phoneNumberMustBeExactly10DigitsStartWithNumberOneError;
	@FindBy(xpath = "//small[text()='Phone Number must be exactly 10 digits.']")
	WebElement phoneNumberMustBeExactly10DigitsSpacialCharecterError;
	@FindBy(xpath = "//input[@name='email']")
	WebElement emailAddress;
	@FindBy(xpath = "//span[text()='Email Address is a required field.']")
	WebElement emailAddressIsARequiredFieldErrorMessag;
	@FindBy(xpath = "//span[text()='Must be a valid Email Address.']")
	WebElement mustBeAValidEmailAddressErrorMessagElement;
	// how to make xpath for Max length
	// @FindBy(xpath = "//input[@id='password']")
	// WebElement password;
	@FindBy(xpath = "//span[text()='Password is a required field.']")
	WebElement passwordIsARequiredFieldErrorMessagElement;
	@FindBy(xpath = "//span[text()='Must contain a minimum of 8 characters.']")
	WebElement mustContainAMinimumOf8CharactersErrorMessag;
	@FindBy(xpath = "//span[text()='Please refer to Password requirements.']")
	WebElement pleaseReferToPasswordRequirementsErrorMessagElement;
	@FindBy(xpath = "//select[@name='gender']")
	WebElement Gender;

	@FindBy(xpath = "//input[@name='home_address_line_1']")
	WebElement HomeAddressLine1;
	@FindBy(xpath = "//span[@id='home_address_error']")
	WebElement HomeAddressLine1IsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[@id='home_address_error']")
	WebElement mustBeAlphanumericCharactersErrorMessagElement;

	@FindBy(xpath = "//input[@name='home_address_line_2']")
	WebElement HomeAddressLine2;

	@FindBy(xpath = "//input[@name='city']")
	WebElement city;

	@FindBy(xpath = "//select[@id='id_state']")
	WebElement state;
	@FindBy(xpath = "//select[@id='id_state']")
	List<WebElement> listOfState;

	@FindBy(xpath = "//input[@name='zip_code']")
	WebElement zipCode;

	@FindBy(xpath = "//input[@name='emergency_contact']")
	WebElement emergencyContract;

	@FindBy(xpath = "//input[@name='sign_by_name']")
	WebElement Signature;
	@FindBy(xpath = "//select[@name='birth_year']")
	WebElement birthYear;
	@FindBy(xpath = "//select[@name='birth_year']/option")
	List<WebElement> birthYearList;
	@FindBy(xpath = "//select[@name='birth_month']")
	WebElement birthMonth;

	@FindBy(xpath = "//select[@id='id_birth_date']")
	WebElement birthDate;
	@FindBy(xpath = "//select[@name='immigration_status']")
	WebElement ImmigrationStatus;
	@FindBy(xpath = "//input[@name='arrival_date']")
	WebElement DateOfArrival;
	@FindBy(xpath = "//input[@id='id_arrival_date']")
	WebElement dateOfArrivalTimElement;
	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement howDidYouKnowAboutEnthrallIt;
	@FindBy(xpath = "//select[@id='id_primary_language']")
	WebElement primaryLanguag;
	@FindBy(xpath = "//select[@id='id_primary_language']/option")
	List<WebElement> primaryLanguageList;
	@FindBy(xpath = "//select[@name='country_of_origin']")
	WebElement countryOfOrigin;
	@FindBy(xpath = "//select[@name='country_of_origin']/option")
	List<WebElement> setCountryOfOrigin;
	@FindBy(css = "input#id_f_name")
	WebElement signature;
	@FindBy(css = "input[id='id_emergency_contact']")
	WebElement eEmergencyContact;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highestEducation;
	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement educationGraduate;
	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement countryOfOriging;
	@FindBy(xpath = "//select[@name='country_of_origin']")
	WebElement countryOfOriginBangladesh;
	@FindBy(css = "select[id='id_primary_language']")
	WebElement languag;
	@FindBy(xpath = "//select[@name='primary_language']/option")
	List<WebElement> listOfLanguag;
	@FindBy(xpath = "//h3[contains(text(), 'Select')]")
	WebElement enrollHeader;
	@FindBy(xpath = "//h5[text()='Please enter your personal and contact information.']")
	WebElement enrollSubHeader;
	@FindBy(xpath = "//p[text()='All fields are required unless marked (optional).']")
	WebElement enrollOtherHeader;
	@FindBy(xpath = "//input[@id='is_agree']")
	WebElement selectAgreeButton;

	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
	WebElement mustBeAlphabeticCharactersErrorMessag3;
	// @FindBy(xpath = "//select[@id='id_i_am']")
	// WebElement iAmIsARequiredFieldErrorMessage;

	// @FindBy(xpath = "//input[@id='id_phone']")
	// WebElement phoneNumberIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//input[@name='image']")
	WebElement personalmageIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[text()='Photo Id is a required field.']")
	WebElement photoIdIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//select[@id='id_birth_year']")
	WebElement birthYearIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//select[@id='id_birth_month']")
	WebElement birthMonthIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[text()='Birth Date is a required field.']")
	WebElement birthDateIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[text()='Home Address Line 1 is a required field.']")
	WebElement homeAddressLine1IsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[text()='City is a required field.']")
	WebElement cityIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[text()='State is a required field.']")
	WebElement stateIsARequiredFieldErrorMessage;
	@FindBy(xpath = "//span[text()='Must be alphabetic characters.']")
	WebElement mustBeAlphabeticCharactersErrorMessage;

	@FindBy(xpath = "//span[text()='Signature is a required field.']")
	WebElement signatureIsARequiredFieldErrorMessage;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submit;

	@FindBy(xpath = "//h1[text()='Registration Successful!']")
	WebElement registrationSuccessfulHeader;

	@FindBy(xpath = "//p[contains(text(), 'Thank you ')]")
	WebElement registrationSuccessfulMessage;
	@FindBy(xpath = "//h1[text()='Automation']")
	WebElement mainTitleAutomation;
	@FindBy(xpath = "//a[text()='Back']")
	WebElement backButton;
	@FindBy(xpath = "//a[text()='Cancel']")
	WebElement cancelButton;

	public void validateLogoAndTitle() {
		elementDisplayed(logo);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
	}

	public void clickLoginButton() {
		elementDisplayed(logInFromToolbar);
		// clickEliment(logInFromToolbar);
		js.executeScript("arguments[0].click()", logInFromToolbar);
		pause(4000);
		// elementDisplayed(email);
		elementDisplayed(email);
		inputText(email, "Kaylith1@gmail.com");
		pause(4000);
		elementDisplayed(password);
		inputText(password, "Abcd12345%");
		pause(4000);
		elementEnabled(loginButton);
		// verifyTextOfTheWebElement(loginButton, "log in");
		clickElement(loginButton);
		pause(2000);

	}

	public void landingOnEnthrallItDashbord() {
		pause(4000);
		// verifyTitle(driver, "Entrhall It Dasboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		validationOfHeader(dashboard, "Dashboard");
		pause(3000);
	}

	public void clickAutomationButton() {
		elementEnabled(automation);
		// verifyTextOfTheWebElement(automation, "Automation");
		clickElement(automation);
		pause(4000);
	}

	public void landingOnAutomationPage() {
		pause(4000);
		verifyCurrentUrl(driver,"https://enthrallit.com/dashboard/dashboard/automation/");
		//verifyTitle(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		validationOfHeader(automation, "Automation");
		pause(4000);
	}

	public void clickEnrollNowPage() {
		elementEnabled(enrollNow);
		// verifyTextOfTheWebElement(enrollNow, "Enroll Now");
		clickElement(enrollNow);
		pause(4000);
		Set<String> allWindowHandales = driver.getWindowHandles();
		String parent = (String) allWindowHandales.toArray()[0];
		String child = (String) allWindowHandales.toArray()[1];
		driver.switchTo().window(child);
		pause(4000);
	}

	public void validationEnrollHomePage() {
		pause(4000);
		//verifyTitle(driver, "https://enthrallit.com/course/dashboard/enrolls/");
		validationOfHeader(enrollHome, "EnrollHome");
		Set<String> allWindowHandales = driver.getWindowHandles();
		String parent = (String) allWindowHandales.toArray()[0];
		String child = (String) allWindowHandales.toArray()[1];
		driver.switchTo().window(child);
		pause(4000);
		// validation of the header, subheader, other header, title, current url
	}

//	public void landingOnEnthrallItEnrollmentForm() {
//		//verifyTitle(driver, "Entrhall/Form");
//		//verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
//		validationOfHeader(dashboard, "EnrollForm");
//		Set<String> allWindowHandales = driver.getWindowHandles();
//		String parent = (String) allWindowHandales.toArray()[0];
//		String child = (String) allWindowHandales.toArray()[1];
//		driver.switchTo().window(child);
//		pause(4000);
//		
//	}

	public void openApplicationAndSubmitButton() {
		// driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
		inputText(fName, "Mashrufa");
		pause(4000);
		inputText(middleName, "Haque");
		pause(4000);
		inputText(lName, "Rahman");
		pause(3000);
		selectDropdown(iAm, "a Student");
		pause(4000);
		selectDropdown(CourseWishToEnroll, "Python");
		pause(3000);
		phonNumber.sendKeys("6092538899");
		pause(3000);
		emailAddress.sendKeys("kaylith1@gmail.com");
		pause(3000);
		password.sendKeys("Abcd12345%");
		pause(4000);
		selectDropdown(Gender, "Female");
		pause(4000);
		File pi = new File("./Image/personalImage.jpg");
		WebElement personalImage = driver.findElement(By.xpath("//input[@name='image']"));
		personalImage.sendKeys(pi.getAbsolutePath());
		pause(4000);
		File phid = new File("./Image/photoId.png");
		WebElement photoId = driver.findElement(By.xpath("//input[@name='photo_id']"));
		photoId.sendKeys(phid.getAbsolutePath());
		pause(4000);
		selectDropdown(birthYear, "1960");
		pause(4000);
		selectDropdown(birthMonth, "February");
		pause(4000);
		selectDropdown(birthDate, "21");
		pause(4000);
		scrollIntoViewToTheElementUsingJavascriptExecutor(driver, submit);
		// scrollIntoViewTheElementUsingJavascriptExecutor(driver, submit);
		pause(4000);
		HomeAddressLine1.sendKeys("709 North Oks Blvd");
		pause(3000);
		HomeAddressLine2.sendKeys("70 Tennyson Rd");
		pause(3000);
		city.sendKeys("North Brunswick");
		pause(4000);
		selectDropdown(state, "Alabama");
		pause(4000);
		zipCode.sendKeys("07781");
		pause(3000);
		selectDropdown(ImmigrationStatus, "Citizen");
		pause(4000);
		// selectDropdown(DateOfArrival, "08-27-2024");
		DateOfArrival.sendKeys("08/03/2024");
		pause(4000);
		emergencyContract.sendKeys("Adam phone number 609-555-8246");
		pause(3000);
		howDidYouKnowAboutEnthrallIt.sendKeys("friend");
		pause(4000);
		// selectDropdown(highestEducation, "Graduate");

		pause(3000);
		selectDropdown(countryOfOrigin, "Bangladesh");
		pause(3000);
		selectDropdown(primaryLanguag, "Bengali");
		pause(3000);
		Signature.sendKeys("Mashrufa Haque Rahman");
		pause(4000);
		// use alert here
		selectAgreeButton.click();
		pause(4000);
		// clickElement(submit);
		clickElement(submit);
		pause(4000);
//	validationOfHeader(registrationSuccessfulHeader, "Registration Successful!");
//	validationOfOtherHeader(registrationSuccessfulMessage,
//			"Thank you for registering. You will receive a confirmation email shortly.");
//	verifyTitle(driver, "Registration Success");
//	verifyCurrentUrl(driver, "https://enthrallit.com/course/enroll/success/");
//	pause(4000);
	}

	public void successfulMessageVarification() {
		validationOfHeader(registrationSuccessfulHeader, "Registration Successful!");
		validationOfOtherHeader(registrationSuccessfulMessage,
				"Thank you for registering. You will receive a confirmation email shortly.");
		verifyTitle(driver, "Registration Success");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/enroll/success/");
		pause(4000);
	}
}