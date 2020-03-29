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
//
//
// USE FULL SCREEEEEEEEEEEEN!!!!!!!!
//
//

//TYPE OF PROBLEM
public class UC1_Test {


    public static void main(String[] args) {
        // Instantiation of Chrome Driver
    	System.setProperty("webdriver.chrome.driver", "C:/Users/xavierrocker/Downloads/chromedriver_win322/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String opt1 = "1", opt2 = "2", opt3 = "3", opt4 = "4",  opt5 = "5", opt6 = "6", opt7 = "7", opt8 = "8";
        
        // launch Chrome and direct it to the Base URL
        driver.get("http://192.168.56.1:3000/");
        
        //Declare Elements and Variables
        WebElement opt1But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[8]"));
        WebElement opt2But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[9]"));
        WebElement opt3But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[10]"));
        WebElement opt4But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[11]"));
        WebElement opt5But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[12]"));
        WebElement opt6But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[13]"));
        WebElement opt7But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[14]"));
        WebElement opt8But = driver.findElement(By.xpath("(//img[@id='Radioimg'])[15]"));
        
        WebElement checker1But = driver.findElement(By.id("problem1"));
        WebElement checker2But = driver.findElement(By.id("problem2"));
        WebElement checker3But = driver.findElement(By.id("problem3"));
        WebElement checker4But = driver.findElement(By.id("problem4"));
        WebElement checker5But = driver.findElement(By.id("problem5"));
        WebElement checker6But = driver.findElement(By.id("problem6"));
        WebElement checker7But = driver.findElement(By.id("problem7"));
        WebElement checker8But = driver.findElement(By.id("problem8"));
        
        
        opt1But.click();
        if(checker1But.isSelected() == true) {
        	System.out.println("Test1.1: First button works, Passed!");
        }else {
        	System.out.println("Test 1.1 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        opt2But.click();
        if(checker2But.isSelected() == true) {
        	System.out.println("Test1.2: 2nd button works, Passed!");
        }else {
        	System.out.println("Test 1.2 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        opt3But.click();
        if(checker3But.isSelected() == true) {
        	System.out.println("Test1.3: 3rd button works, Passed!");
        }else {
        	System.out.println("Test 1.3 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        opt4But.click();
        if(checker4But.isSelected() == true) {
        	System.out.println("Test1.4: 4th button works, Passed!");
        }else {
        	System.out.println("Test 1.4 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        opt5But.click();
        if(checker5But.isSelected() == true) {
        	System.out.println("Test1.5: 5th button works, Passed!");
        }else {
        	System.out.println("Test 1.5 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        opt6But.click();
        if(checker6But.isSelected() == true) {
        	System.out.println("Test1.6: 6th button works, Passed!");
        }else {
        	System.out.println("Test 1.6 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        opt7But.click();
        if(checker7But.isSelected() == true) {
        	System.out.println("Test1.7: 7th button works, Passed!");
        }else {
        	System.out.println("Test 1.7 Failed");
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        opt8But.click();
        if(checker8But.isSelected() == true) {
        	System.out.println("Test1.8: 8th button works, Passed!");
        }else {
        	System.out.println("Test 1.8 Failed");
        }
        
        
        
        //close Fire fox
        driver.close();
       
    }

}