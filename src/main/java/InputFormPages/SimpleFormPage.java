package InputFormPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumEasyTestBase.TestBase;

public class SimpleFormPage extends TestBase {
	
	@FindBy(xpath="//*[@placeholder='Please enter your Message']")
	WebElement enterMessage;
	
	@FindBy(xpath="//*[@class='btn btn-default'][contains(.,'Show Message')]")
	WebElement showMessage;
	
	@FindBy(xpath="//*[@id='display']")
	WebElement textDisplay;
	
	public SimpleFormPage() {
		PageFactory.initElements(driver, this);
	}
	
    public String verifySimpleFormPageTitle() {
		
		return driver.getTitle();
		
		
	}
    
    public String verifyYourMessageText(String str) {
    	enterMessage.sendKeys(str);
    	showMessage.click();
    	String text=textDisplay.getText();
    	return text;
    		
	
		   	
    	
    }
		
	}

