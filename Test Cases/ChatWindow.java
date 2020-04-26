package newPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChatWindow {
	
	public static void waiting() {
		try {
			Thread.sleep(1000);
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
        
        // Declaring chat window elements
        WebElement chatWindowBut = driver.findElement(By.xpath("//div[@id='sc-launcher']/div/img[2]"));
	    WebElement textField = driver.findElement(By.xpath("//div[@id='sc-launcher']/div[2]/form/div"));
	    
	    // Instantiating first two strings to be sent as messages
	    String firstMsg = "Hello";
	    String secondMsg = "I have a query";
	    
	    // Typing and sending in the chat window
	    chatWindowBut.click();
	    waiting();
	    
	    textField.sendKeys(firstMsg);
	    waiting();
	    
	    // Send button only appears when text is written in the input field
	    WebElement sendBut = driver.findElement(By.cssSelector(".sc-user-input--send-icon"));
	    sendBut.click();
	    waiting();
	    
	    textField.sendKeys(secondMsg);
	    waiting();
	    
	    sendBut.click();
	    waiting();
	    
	    // Checking whether messages in chat window matches the messages sent by user
	    WebElement firstMsgChat = driver.findElement(By.xpath("//div[@id='sc-launcher']/div[2]/div[2]/div/div/div[2]"));
	    WebElement secMsgChat = driver.findElement(By.xpath("//div[@id='sc-launcher']/div[2]/div[2]/div[2]/div/div[2]"));
	    
	    if(firstMsgChat.getText().contentEquals(firstMsg) && secMsgChat.getText().contentEquals(secondMsg)) {
	    	System.out.println("Messages displayed matches user input. Test passed.");
	    }else {
	    	System.out.println("Messages displayed does not match user input. Test failed.");
	    }
	    
	    //close Chrome
	    driver.close();
	}

}
