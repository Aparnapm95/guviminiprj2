package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseTest {
	protected WebDriver driver;
	 protected static ExtentReports extent;
	    protected ExtentTest test;

	    @BeforeSuite
	    public void setUpReport() {
	        extent = ExtentManager.getExtentReports();
	    }

	    @BeforeMethod
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
	    }

	    @AfterMethod
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @AfterSuite
	    public void tearDownReport() {
	        extent.flush();
	    }
    
	
}
