package ESCSeleniumTesting;

import org.openqa.selenium.*;
//WebDriver Class is needed to instantiate a browser with a specific driver
import org.openqa.selenium.WebDriver;
//ChromeDriver is attached to Webdriver to instantitate a chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.*;
import java.net.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;

// MODE OF COMMUNICATION
public class UC2_Test {


    public static void main(String[] args) {
    	// Instantiation of Chrome Driver
    	System.setProperty("webdriver.chrome.driver", "C:/Users/xavierrocker/Downloads/chromedriver_win322/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    	// launch Chrome and direct it to the Base URL
    	driver.get("http://192.168.56.1:3000/");
    	
    	//Declare Elements and Variables
        String chat = "1", video= "2", voice= "3";
                WebElement chatBut = driver.findElement(By.id("Radioimg"));
        WebElement videoBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[2]"));
        WebElement voiceBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[3]"));
        
        WebElement checkval = driver.findElement(By.name("chatMode"));
        
        //
        // Test0: Get the default selection of communication mode
        //
        
        chatBut.click();
        if(checkval.getAttribute("value").contentEquals(chat)) {
        	System.out.println("Test1.1: Chat button works, Passed!");
        }else {
        	System.out.println("Test 1.1 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        //
        // Test1.1: Check other buttons work
        //
        videoBut.click();
        if(checkval.getAttribute("value").contentEquals(video)) {
        	System.out.println("Test1.2: Video button works, Passed!");
        }else {
        	System.out.println("Test 1.2 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        //
        // Test1.2: Check other buttons work
        //
        voiceBut.click();
        if(checkval.getAttribute("value").contentEquals(voice)) {
        	System.out.println("Test1.3: Voice button works, Passed!");
        }else {
        	System.out.println("Test 1.3 Failed");
        }
        
        //close Chrome
        driver.close();
       
    }

}

