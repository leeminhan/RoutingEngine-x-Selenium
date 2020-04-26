package newPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleSubmit {

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
        
        // Declaring the form elements
        WebElement fNameInput = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/form/div/div/input"));
        WebElement lNameInput = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/form/div[2]/div/input"));  
        WebElement chatBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[2]"));
        WebElement langBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[3]"));
        WebElement problemBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[8]"));
	    WebElement submitBut = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	    
		
		System.out.println("Testing multiple submit");
		
		// Filling up all fields and then submitting twice
    	fNameInput.sendKeys("Keith");
    	System.out.println("first name input");
    	waiting();
    
    	lNameInput.sendKeys("Ng");
    	System.out.println("last name input");
    	waiting();
    
    	chatBut.click();
    	System.out.println("chatmode selected");
    	waiting();
    
    	langBut.click();
    	System.out.println("language selected");
    	waiting();
    
    	problemBut.click();
    	System.out.println("problem selected");
    	waiting();
	    
		submitBut.click();	
		System.out.println("Submit button clicked once");
		waiting();
		
		submitBut.click();
		System.out.println("Submit button clicked twice");
		waiting();
		
		// Checking whether toast is shown
		if(driver.findElements(By.className("multipleSubmit")).size() > 0){
			System.out.println("multiple submit toast is present, test has passed");
		} else {
			System.out.println("multiple submit toast is not present, test has failed");
		}
		
		//close Chrome
	    driver.close();
	}

}
