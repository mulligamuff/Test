package stepDefs;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import org.openqa.selenium.By;
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
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("User is on the registration page")
    public void user_is_on_the_registration_page() {
        driver.get(baseUrl);
    }

    @When("User enters valid user details")
    public void user_enters_valid_user_details() {
        enterUserDetails("John", "Doe", "john.doe@example.com", "password123", true);
    }

    @When("User enters valid user details without last name")
    public void user_enters_valid_user_details_without_last_name() {
        enterUserDetails("John", "", "john.doe@example.com", "password123", true);
    }

    @When("User enters valid user details with mismatched password")
    public void user_enters_valid_user_details_with_mismatched_password() {
        enterUserDetails("John", "Doe", "john.doe@example.com", "password123", false);
    }

    @When("User enters valid user details without accepting terms and conditions")
    public void user_enters_valid_user_details_without_accepting_terms_and_conditions() {
        enterUserDetails("John", "Doe", "john.doe@example.com", "password123", false);
    }

    @When("Clicks on the button to submit the details")
    public void clicks_on_the_button_to_submit_the_details() {
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }

    @Then("User should be registered successfully")
    public void user_should_be_registered_successfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Uppdatera tidsangivelsen här
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));
        assertTrue(successMessage.isDisplayed());
    }

    @Then("Registration should fail with an error message")
    public void registration_should_fail_with_an_error_message() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Uppdatera tidsangivelsen här
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("errorMessage")));
        assertTrue(errorMessage.isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    private void enterUserDetails(String firstName, String lastName, String email, String password, boolean acceptTerms) {
        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys(firstName);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys(lastName);

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys(email);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        if (!acceptTerms) {
            WebElement termsCheckbox = driver.findElement(By.id("termsCheckbox"));
            termsCheckbox.click();
        }
    }
}
