package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;

public class DeleteContactTest extends BaseTest {
	 @Test
	    public void testDeleteContact() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("testuser@email.com", "Password123");

	        // Assume logic to delete a contact (click delete button after locating contact)
	    }

}
