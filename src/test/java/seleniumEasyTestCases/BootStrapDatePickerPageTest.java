package seleniumEasyTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DatePickerPages.BootStrapDatePickerPage;
import InputFormPages.SimpleFormPage;
import seleniumEasyPages.HomePage;
import seleniumEasyTestBase.TestBase;

public class BootStrapDatePickerPageTest extends TestBase {
	
	HomePage homepage;
	BootStrapDatePickerPage bootStrapDatePickerPage;
	
	public BootStrapDatePickerPageTest() {
		
		super();
	}
	
	@BeforeTest
	  public void setup() {
		  initialization();
		  homepage=new HomePage();
		  bootStrapDatePickerPage=new BootStrapDatePickerPage();
		  
	  }
@Test
public void verifyBootStrapDatePickerPageTitleTest() throws InterruptedException {
	
	bootStrapDatePickerPage=homepage.clickOnBootstrapDatePickerLink();
	
	String actualTitleB=bootStrapDatePickerPage.verifyBootStrapDatePickerPageTitle();
	
	assertEquals(actualTitleB, "Selenium Easy - Best Demo website for Bootstrap Date picker");
	
		
}

@Test

public void selectDateTest() throws InterruptedException {
	bootStrapDatePickerPage=homepage.clickOnBootstrapDatePickerLink();
	
	bootStrapDatePickerPage.VerifySelectDate();
	
	
}
}
