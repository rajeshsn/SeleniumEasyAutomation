import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


@Test
public class ToDO {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Downloads\\chromedriver_win32\\chromedriver.exe");

    WebDriver driver =new ChromeDriver();


driver.get("https://www.seleniumeasy.com/test/");

driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS );

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.manage().deleteAllCookies();

driver.manage().window().maximize();

driver.findElement(By.xpath("//*[contains(@class,'dropdown-toggle')][contains(text(),'Input Forms')]")).click();
driver.findElement(By.xpath("//a[contains(.,'Simple Form Demo')]")).click();
}
}

