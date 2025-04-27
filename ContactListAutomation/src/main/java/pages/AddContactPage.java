package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddContactPage {
	WebDriver driver;

    By firstNameField = By.id("firstName");
    By lastNameField = By.id("lastName");
    By emailField = By.id("email");
    By phoneField = By.id("phone");
    By submitBtn = By.xpath("//button[text()='Submit']");

    public AddContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillContactForm(String firstName, String lastName, String email, String phone) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickSubmit() {
        driver.findElement(submitBtn).click();
    }
	
}
