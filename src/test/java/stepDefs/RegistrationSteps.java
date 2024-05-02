package stepDefs;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import java.time.Duration;

public class RegistrationSteps {

    private WebDriver driver;
    private String baseUrl = "https://membership.basketballengland.co.uk/NewSupporterAccount";



    @Before
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver.get(baseUrl);
    }

    @When("User enters valid user details")
    public void user_enters_valid_user_details() {
        enterUserDetails("25/05/1994","John", "Doe", "cottoncuddle.rex+EC@gmail.com", "cottoncuddle.rex+EC@gmail.com", "password123", "password123", true);
    }

    @When("Clicks on the button to submit the details")
    public void clicks_on_the_button_to_submit_the_details() {
        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-big.red[value='CONFIRM AND JOIN']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement clickableButton = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        clickableButton.click();
    }

    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.bold.gray.text-center.margin-bottom-40")));
        assertTrue(successMessage.isDisplayed());
    }


    @Then("Registration should fail with an error message")
    public void registration_should_fail_with_an_error_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessage")));
        assertTrue(errorMessage.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private void clickCheckboxById(String id){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("document.getElementById('" + id + "').click();");
    }
    private void enterUserDetails(String dateOfBirth, String firstName, String lastName, String eMail, String confEmail, String password, String confPassword, boolean acceptTerms) {
        WebElement dateOfBirthField = driver.findElement(By.id("dp"));
        dateOfBirthField.sendKeys(dateOfBirth);

        WebElement firstNameField = driver.findElement(By.id("member_firstname"));
        firstNameField.sendKeys(firstName);

        WebElement lastNameField = driver.findElement(By.id("member_lastname"));
        lastNameField.sendKeys(lastName);

        WebElement emailField = driver.findElement(By.id("member_emailaddress"));
        emailField.sendKeys(eMail);

        WebElement confEmailField = driver.findElement(By.id("member_confirmemailaddress"));
        confEmailField.sendKeys(confEmail);

        WebElement passwordField = driver.findElement(By.id("signupunlicenced_password"));
        passwordField.sendKeys(password);

        WebElement confPasswordField = driver.findElement(By.id("signupunlicenced_confirmpassword"));
        confPasswordField.sendKeys(confPassword);

        if (acceptTerms) {
            clickCheckboxById("sign_up_25");
            clickCheckboxById("sign_up_26");
            clickCheckboxById("fanmembersignup_agreetocodeofethicsandconduct");
        }

    }
}
