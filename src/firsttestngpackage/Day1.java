package firsttestngpackage;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Day1 {
	public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
    String driverPath = "C:\\geckodriver.exe";
    public WebDriver driver ;
    
  @Test
  public void verifyHomepageTitle() {
	  System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aisha Kaiser\\Downloads\\chromedriver_win32\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      System.out.println("Here lies the Actual Title:" + actualTitle);
      
      
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
	  
  }

  @BeforeSuite
  public void beforeSuite() {
  } 

  @AfterSuite
  public void afterSuite() {
  }

}
