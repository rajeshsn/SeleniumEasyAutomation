package seleniumEasyTestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import InputFormPages.CheckBoxDemoPage;
import InputFormPages.SimpleFormPage;
import seleniumEasyPages.HomePage;
import seleniumEasyTestBase.TestBase;

public class CheckBoxDemoPageTest extends TestBase {
	HomePage homepage;
	SimpleFormPage simpleformPage;
	CheckBoxDemoPage checkboxdemoPage;
	
	public  CheckBoxDemoPageTest() {
		
		super();
	}
	
	@BeforeTest
	  public void setup() {
		  initialization();
		  homepage=new HomePage();
		  simpleformPage=new SimpleFormPage();
	  }

@Test
public void verifyCheckBoxDemoPageTitleTest() throws InterruptedException {
checkboxdemoPage=homepage.clickOnCheckBoxDemoPageLink();
String actualChekBoxTitle=checkboxdemoPage.verifyCheckBoxDemoPageTitle();

assertEquals(actualChekBoxTitle, "Selenium Easy - Checkbox demo for automation using selenium");
	
}
@Test
public void verifyClickOnSingleCheckBoxTest() throws InterruptedException {
	checkboxdemoPage=homepage.clickOnCheckBoxDemoPageLink();
	checkboxdemoPage.verifyClickOnSingleCheckBox();
	
}


}
