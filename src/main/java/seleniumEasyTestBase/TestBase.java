package seleniumEasyTestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.EqualsMethod;
import seleniumEasyTestUtilities.TestUtilities;

public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	 protected TestBase() {
		try {
		prop=new Properties();
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Rajesh\\Desktop\\InterviewPrep\\seleniumEasyAutomationTest\\src\\main\\java\\seleniumEasyConfig\\config.properties");
		
		prop.load(fi);
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rajesh\\Desktop\\Assignment\\geckodriver-v0.20.1-win32\\geckodriver.exe");
			 driver =new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS );
		
		driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		
	}
public static void teardown() {
	
	driver.quit();
}
}
