package seleniumEasyPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import DatePickerPages.BootStrapDatePickerPage;
import InputFormPages.CheckBoxDemoPage;
import InputFormPages.SimpleFormPage;
import seleniumEasyTestBase.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//*[contains(@class,'dropdown-toggle')][contains(text(),'Input Forms')]")
	WebElement inputform;
	
	@FindBy(xpath="//a[contains(.,'Simple Form Demo')]")
	WebElement simpleForm;
	
	@FindBy(xpath="//a[contains(.,'Checkbox Demo')]")
	WebElement checkBox;
	
	@FindBy(xpath="//*[contains(@class,'dropdown-toggle')][contains(text(),'Date pickers')]")
	WebElement datePicker;
	
	@FindBy(xpath="//a[contains(.,'Bootstrap Date Picker')]")
	WebElement bootStrapDate;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
//1--> **To Navigate to Simple Form Page ***//
	
	public SimpleFormPage clickOnSimpleFormLink() throws InterruptedException {
		inputform.click();
		simpleForm.click();
		return new SimpleFormPage();
			
}
	
//2--> **To Verify Home Page Title **//
	
	public String verifyHomePageTitle() {
		
		return driver.getTitle();
		
		
	}
	
//3--> **To Navigate to BootStrap Date Page ***//	
	
	public  BootStrapDatePickerPage clickOnBootstrapDatePickerLink() throws InterruptedException {
		datePicker.click();
		bootStrapDate.click();
		return new BootStrapDatePickerPage();
	
}
	//3--> **To Navigate to Check Box Demo Page ***//
	
	public  CheckBoxDemoPage clickOnCheckBoxDemoPageLink() throws InterruptedException {
		inputform.click();
		checkBox.click();
		return new CheckBoxDemoPage();
	
}
}
