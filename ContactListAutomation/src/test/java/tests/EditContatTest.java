package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;

public class EditContatTest  extends BaseTest{
	  @Test
	    public void testEditContact() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("testuser@email.com", "Password123");

	       
	    }
}
