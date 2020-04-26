package newPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpamMessage {
	
	public static void waiting() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		// Instantiation of Chrome Driver
    	System.setProperty("webdriver.chrome.driver", "/Users/keith1111/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
		// Launch Chrome and direct it to the Base URL
        driver.get("http://localhost:3000/");
		
		WebElement chat = ((ChromeDriver) driver).findElementByClassName("sc-closed-icon");
		WebElement input = ((ChromeDriver) driver).findElementByClassName("sc-user-input--text");
		
		// Open chat window
		chat.click();
		 
		// Spam 10 messages
		for(int i=0;i<11;i++) {
			input.sendKeys("Yo");
			WebElement formbtn = ((ChromeDriver) driver).findElementByClassName("sc-user-input--send-icon-wrapper");
			formbtn.click();
		}
		
		// Check that toast appears.
		if(driver.findElements(By.className("spamMsg")).size() > 0) {
			System.out.println("toast detected. Test passed");	    
		} else {
			System.out.println("toast not detected. Test failed");
		}
		
		//close Chrome
		driver.close();
      
	}

}
