package DatePickerPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumEasyTestBase.TestBase;
import seleniumEasyTestUtilities.TestUtilities;

public class BootStrapDatePickerPage extends TestBase {

	@FindBy(xpath="//*[contains(@class,'dropdown-toggle')][contains(text(),'Date pickers')]")
	WebElement datePickers;
	
	@FindBy(xpath="//a[contains(.,'Bootstrap Date Picker')]")
	WebElement bootStrapDatePicker;


	public BootStrapDatePickerPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyBootStrapDatePickerPageTitle() {
		
		return driver.getTitle();
		
		
	}
	
	public void VerifySelectDate() throws InterruptedException {
		
		TestUtilities.selectDate("July 2019","20");
	}
}
