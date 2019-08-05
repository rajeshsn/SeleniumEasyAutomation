package seleniumEasyTestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DatePickerPages.BootStrapDatePickerPage;
import InputFormPages.SimpleFormPage;
import seleniumEasyPages.HomePage;
import seleniumEasyTestBase.TestBase;

public class HomePageTest extends TestBase {
	HomePage homepage;
	SimpleFormPage simpleformPage;
	BootStrapDatePickerPage bootStrapDatePickerPage;
	
	public HomePageTest() {
		super();
	}
	 
		@BeforeTest
		  public void setup() {
			  initialization();
			  homepage=new HomePage();
			  simpleformPage=new SimpleFormPage();
		  }
       
		@Test(priority=1)
        public void verifyHomePageTitleTest() throws InterruptedException {
        	String actualtitle=homepage.verifyHomePageTitle();
        	assertEquals(actualtitle, "Selenium Easy - Best Demo website to practice Selenium Webdriver Online");
        	
        	   }
		
		@Test(priority=2)
		
		public void clickOnSimpleFormPageLinkTest() throws InterruptedException {
			
			simpleformPage=homepage.clickOnSimpleFormLink();
		}
		
@Test(priority=3)
		
		public void clickOnBootStrapDatePickerTest() throws InterruptedException{
	
	bootStrapDatePickerPage=homepage.clickOnBootstrapDatePickerLink();
}	
		
@AfterMethod
public void tearDown() {
	
	//driver.quit();
}
}
