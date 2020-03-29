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

//LANGUAGE
public class UC3_Test {


    public static void main(String[] args) {
    	// Instantiation of Chrome Driver
    	System.setProperty("webdriver.chrome.driver", "C:/Users/xavierrocker/Downloads/chromedriver_win322/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
		
        String eng = "1", mal = "2", chi = "3", tam = "NaN";
        
     // launch Chrome and direct it to the Base URL
        driver.get("http://192.168.56.1:3000/");
        
        //Declare Elements and Variables
        WebElement engBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[4]"));
        WebElement malBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[5]"));
        WebElement chiBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[6]"));
        WebElement tamBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[7]"));
        WebElement checkval = driver.findElement(By.name("language"));
        
        //
        // Test0: Get the default selection of communication mode
        //
        engBut.click();
        if(checkval.getAttribute("value").contentEquals(eng)) {
        	System.out.println("Test1.1: Eng button works, Passed!");
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
        // Test1.1: Check other buttons work (Malay)
        //
        malBut.click();
        if(checkval.getAttribute("value").contentEquals(mal)) {
        	System.out.println("Test1.2: Bahasa Melayu button works, Passed!");
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
        // Test1.2: Check other buttons work (Chinese)
        //
        chiBut.click();
        if(checkval.getAttribute("value").contentEquals(chi)) {
        	System.out.println("Test1.3: Chinese button works, Passed!");
        }else {
        	System.out.println("Test 1.3 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
        //
        // Test1.3: Check other buttons work (Chinese)
        //
        tamBut.click();
        if(checkval.getAttribute("value").contentEquals(tam)) {
        	System.out.println("Test1.4: Tamil button works, Passed!");
        }else {
        	System.out.println("Test 1.4 Failed");
        }
        
        //close Chrome
        driver.close();
       
    }

}
