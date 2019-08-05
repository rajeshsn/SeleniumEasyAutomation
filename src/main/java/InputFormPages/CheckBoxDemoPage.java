package InputFormPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumEasyTestBase.TestBase;

public class CheckBoxDemoPage extends TestBase {
	
	@FindBy(xpath="//*[@id='isAgeSelected']")
	WebElement clickOnCheckBox;
	
	@FindBy(xpath="//*[@id='txtAge']")
	WebElement messageAfterCheckBoxSelect;
	
	
	@FindBy(xpath="//button[@id='check1']")
	WebElement multipleOptionCheckBoxButton;
	
	 public CheckBoxDemoPage() 
	 {
		PageFactory.initElements(driver, this);
	}
	
    public String verifyCheckBoxDemoPageTitle() {
		
		return driver.getTitle();
		
		
	}
    
    public String verifyClickOnSingleCheckBox() {
    	
    	clickOnCheckBox.click();
    	
    	String str=messageAfterCheckBoxSelect.getText();
    	
    	return str;
    	
    }
    

}
