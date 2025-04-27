package tests;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.BaseTest;

public class LoginTest extends BaseTest {
	 @Test
	    public void testLogin() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.login("aparnaskzr1995@gmail.com", "P5ZkkxgHBPUw@cN");
	    }
	
}
