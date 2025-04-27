package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	 WebDriver driver;

	    By addContactBtn = By.id("add-contact");
	    By logoutBtn = By.xpath("//button[text()='Logout']");

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickAddContact() {
	        driver.findElement(addContactBtn).click();
	    }

	    public void clickLogout() {
	        driver.findElement(logoutBtn).click();
	    }
	

}
