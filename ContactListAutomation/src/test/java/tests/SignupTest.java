package tests;

import org.testng.annotations.Test;

import pages.SignupPage;
import utils.BaseTest;

public class SignupTest extends BaseTest{
	@Test
	public void signupTest() {
        test = extent.createTest("Signup Test");

   
        SignupPage signupPage = new SignupPage(driver);
        signupPage.clickSignup();
        signupPage.enterDetails("John", "Doe", "john.doe" + System.currentTimeMillis() + "@email.com", "P5ZkkxgHBPUw@cN");
        signupPage.clickSubmit();
    }
	
	}

