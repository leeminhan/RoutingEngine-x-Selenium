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

public class UCName_Test {


    public static void main(String[] args) {
        // Instantiation of Chrome Driver
    	System.setProperty("webdriver.chrome.driver", "C:/Users/xavierrocker/Downloads/chromedriver_win322/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
        // launch Chrome and direct it to the Base URL
		driver.get("http://192.168.56.1:3000/");
		
		//Declare Elements and Variables
        WebElement firstForm = driver.findElement(By.name("FirstName"));
        WebElement secForm = driver.findElement(By.name("LastName"));
        String firstName ="", secName = "";
        
        //
        // Test1: Filling in Valid Input
        //
        firstName ="David";
        secName = "Tan";
        firstForm.sendKeys("David");
        secForm.sendKeys("Tan");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        if (firstForm.getAttribute("value").contentEquals(firstName) && secForm.getAttribute("value").contentEquals(secName)) {
        	System.out.println("Test 1: Check valid input, Passed!");
        }else {
        	System.out.println("Test 1 Failed");
        }
        
        //close Chrome
        driver.close();
       
    }

}