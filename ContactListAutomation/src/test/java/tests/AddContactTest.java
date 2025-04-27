package tests;

import org.testng.annotations.Test;

import pages.AddContactPage;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class AddContactTest extends BaseTest {
	 @Test
	    public void testAddContact() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("aparnaskzr1995@email.com", "P5ZkkxgHBPUw@cN");

	        HomePage homePage = new HomePage(driver);
	        homePage.clickAddContact();

	        AddContactPage addContactPage = new AddContactPage(driver);
	        addContactPage.fillContactForm("Alice", "Smith", "alice.smith@email.com", "1234567890");
	        addContactPage.clickSubmit();
	    }
}
