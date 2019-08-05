package seleniumEasyTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import InputFormPages.SimpleFormPage;
import seleniumEasyPages.HomePage;
import seleniumEasyTestBase.TestBase;

public class SimpleFormPageTest extends TestBase {
	
	HomePage homepage;
	SimpleFormPage simpleformPage;
	
	public  SimpleFormPageTest() {
		
		super();
	}
	 
		@BeforeTest
		  public void setup() {
			  initialization();
			  homepage=new HomePage();
			  simpleformPage=new SimpleFormPage();
		  }

	@Test
	public void verifySimpleFormPageTitleTest() throws InterruptedException {
	simpleformPage=homepage.clickOnSimpleFormLink();
	String actualtitle1=simpleformPage.verifySimpleFormPageTitle();

	assertEquals(actualtitle1, "Selenium Easy Demo - Simple Form to Automate using Selenium");
		
	}
		
	@Test
	public void verifyYourMessageTextTest() throws InterruptedException {
		simpleformPage=homepage.clickOnSimpleFormLink();
		simpleformPage.verifyYourMessageText("My Dream is to Fly..So High So High");
		
		//Assert.assertTrue(simpleformPage.verifyYourMessageText("My Dream is to Fly..So High So High"));
		
	}

	  @AfterTest
	 public void tearDown() {
		//  teardown();
	 }

}


