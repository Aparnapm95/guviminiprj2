package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
	WebDriver driver;

    By signupBtn = By.id("signup");
    By firstNameField = By.id("firstName");
    By lastNameField = By.id("lastName");
    By emailField = By.id("email");
    By passwordField = By.id("password");
    By submitBtn = By.xpath("//button[text()='Submit']");

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignup() {
        driver.findElement(signupBtn).click();
    }

    public void enterDetails(String firstName, String lastName, String email, String password) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }
	
}
