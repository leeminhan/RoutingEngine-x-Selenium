package ESCSeleniumTesting;

//WebDriver Class is needed to instantiate a browser with a specific driver
import org.openqa.selenium.*;
//ChromeDriver is attached to Webdriver to instantitate a chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.*;
import java.net.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;

public class MessageUC_Test {
	public static void main(String[] args) {
		// Instantiation of Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/xavierrocker/Downloads/chromedriver_win322/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// launch Chrome and direct it to the Base URL
		driver.get("http://192.168.56.1:3000/");
		
		//Declare Elements and Variables (Some are declared later because they appear later)
	    WebElement msgBut = driver.findElement(By.xpath("//div[@id='sc-launcher']/div/img[2]"));
	    WebElement textField = driver.findElement(By.xpath("//div[@id='sc-launcher']/div[2]/form/div"));
	    
	    String firster = "Hello";
	    String seconder = "I have a query";
	    
	    // Click on chat button for popup
	    msgBut.click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    //Input "Hello" in text field
	    textField.sendKeys("Hello");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    // Send button only appears when text is written in the input field
	    WebElement sendBut = driver.findElement(By.cssSelector(".sc-user-input--send-icon"));
	    
	    // Clicks the send message button
	    sendBut.click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    // First message only pops up in the screen when we click send
	    WebElement firstMsg = driver.findElement(By.xpath("//div[@id='sc-launcher']/div[2]/div[2]/div/div/div[2]"));
	    
	    // Input "I have a query" in text field
	    textField.sendKeys("I have a query");
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    // Clicks the send message button
	    sendBut.click();
	    try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    //Checks to see if both messages appear correctly in the pop up chatbox
	    WebElement secMsg = driver.findElement(By.xpath("//div[@id='sc-launcher']/div[2]/div[2]/div[2]/div/div[2]"));
	    if(firstMsg.getText().contentEquals(firster) && secMsg.getText().contentEquals(seconder)) {
	    	System.out.println("Test 1: Check sending valid message works, Passed!");
	    }else {
	    	System.out.println("Test 1 Failed");
	    }
	    
	  //close Chrome
	    driver.close();
	}

}
