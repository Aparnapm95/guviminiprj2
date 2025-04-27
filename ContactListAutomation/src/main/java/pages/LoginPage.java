package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

    By emailField = By.id("email");
    By passwordField = By.id("password");
    By submitBtn = By.xpath("//button[text()='Submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(emailField).sendKeys("aparnaskzr1995@gmail.com");
        driver.findElement(passwordField).sendKeys("P5ZkkxgHBPUw@cN");
        driver.findElement(submitBtn).click();
    }
	
}
