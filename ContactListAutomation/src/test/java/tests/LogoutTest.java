package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class LogoutTest extends BaseTest {
	ExtentTest test;
	@Test
	public void LogoutTest() {
        

   
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("aparnaskzr1995@email.com", "P5ZkkxgHBPUw@cN");

        HomePage homePage = new HomePage(driver);
        homePage.clickLogout();
        
        test.pass("Logout successful!");
    }

	

}
