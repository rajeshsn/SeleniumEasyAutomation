package seleniumEasyTestUtilities;

import java.awt.List;
import java.sql.Driver;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import seleniumEasyTestBase.TestBase;

public class TestUtilities extends TestBase {
   public static long PAGE_LOAD_TIMEOUT=20;
      public static long IMPLICIT_WAIT=20;
     
   //***********Date Picker**************//
      
      public static void selectDate(String month, String date) throws InterruptedException {
    	    
    	driver.findElement(By.xpath("//div[@class='input-group date']/span[@class='input-group-addon']")).click();
    	  
    	 WebElement mon=driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]"));
    	 
    	 while(true) {
    		 
    		 if(mon.getText().equalsIgnoreCase(month)) {
    			 
    			 break;
    		 }
    		 
    		 else {
    			 
    			 driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[1]")).click();
    		Thread.sleep(5000);
    		 }
    	 }
    	 driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),'"+date+"')]")).click();
    	 
    	 Thread.sleep(5000);
}
}
