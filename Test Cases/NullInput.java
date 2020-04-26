package newPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.*;
import java.net.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;
import java.util.Random;

public class NullInput {
	
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
        
        // Declaring the form elements
        WebElement fNameInput = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/form/div/div/input"));
        WebElement lNameInput = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/form/div[2]/div/input"));  
        WebElement chatBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[2]"));
        WebElement langBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[3]"));
        WebElement problemBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[8]"));
	    WebElement submitBut = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	    
		
		System.out.println("Testing empty fields");
	    
	    // Select one field at random to be left blank and filling up the rest
	    Random r = new Random();
	    int rand = r.nextInt(5); 
	    System.out.println(rand);
	    
	    if (rand != 0) {
	    	fNameInput.sendKeys("Keith");
	    	System.out.println("first name input");
	    }
	    waiting();    
	    if (rand != 1) {
	    	lNameInput.sendKeys("Ng");
	    	System.out.println("last name input");
	    }
	    waiting();
	    if (rand != 2) {
	    	chatBut.click();
	    	System.out.println("chatmode selected");
	    }
	    waiting();
	    if (rand != 3) {
	    	langBut.click();
	    	System.out.println("language selected");
	    }
	    waiting();
	    if (rand != 4) {
	    	problemBut.click();
	    	System.out.println("problem selected");
	    }
	    waiting();
		submitBut.click();
		System.out.println("Submitted");
		waiting();
		
		// Checking whether toast is shown
		if(driver.findElements(By.className("nullInput")).size() > 0){
			System.out.println("null input toast is present, test has passed");
		} else {
			System.out.println("null input toast is not present, test has failed");
		}
		waiting();
		
		//close Chrome
	    driver.close();
		
	}
}


