package newPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckValues {
	
	public static void waiting() {
		try {
			Thread.sleep(100);
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
        
        //Declaring form elements
        WebElement fNameInput = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/form/div/div/input"));
        WebElement lNameInput = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/form/div[2]/div/input"));
        WebElement chatMessageBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])"));
        WebElement videoCallBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[2]"));
        WebElement englishBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[3]"));
	    WebElement malayBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[4]"));
	    WebElement chineseBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[5]"));
        WebElement tamilBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[6]"));
        WebElement educationBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[7]"));
	    WebElement healthBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[8]"));
	    WebElement houseBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[9]"));
        WebElement accountBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[10]"));
        WebElement employmentBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[11]"));
	    WebElement retirementBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[12]"));
	    
	    WebElement chatModeVal = driver.findElement(By.name("chatMode"));
	    WebElement languageVal = driver.findElement(By.name("language"));
	    WebElement topVal = driver.findElement(By.name("problem"));
	    
	    // Instantiating number of failed and passed test cases
	    int numPassed = 0;
	    int numFailed = 0;
	    
	    // Checking the value of every form element
        fNameInput.sendKeys("David");
        if (fNameInput.getAttribute("value").contentEquals("David")) {
        	numPassed += 1;
        	System.out.println("first name field passed");
        } else {
        	numFailed += 1;
        	System.out.println("first name field failed");
        }
        waiting();
        
        lNameInput.sendKeys("Tan");
        if (lNameInput.getAttribute("value").contentEquals("Tan")) {
        	numPassed += 1;
        	System.out.println("last name field passed");
        } else {
        	numFailed += 1;
        	System.out.println("last name field failed");
        }
        waiting();
        
        chatMessageBut.click();
        if (chatModeVal.getAttribute("value").contentEquals("1")) {
        	numPassed += 1;
        	System.out.println("chat messaging button passed");
        } else {
        	numFailed += 1;
        	System.out.println("chat messaging button failed");
        }
        waiting();
        
        videoCallBut.click();
        if (chatModeVal.getAttribute("value").contentEquals("2")) {
        	numPassed += 1;
        	System.out.println("video call button passed");
        } else {
        	numFailed += 1;
        	System.out.println("video call button failed");
        }
        waiting();
        
        englishBut.click();
        if (languageVal.getAttribute("value").contentEquals("1")) {
        	numPassed += 1;
        	System.out.println("english button passed");
        } else {
        	numFailed += 1;
        	System.out.println("english button failed");
        }
        waiting();
        
        malayBut.click();
        if (languageVal.getAttribute("value").contentEquals("2")) {
        	numPassed += 1;
        	System.out.println("malay button passed");
        } else {
        	numFailed += 1;
        	System.out.println("malay button failed");
        }
        waiting();
        
        chineseBut.click();
        if (languageVal.getAttribute("value").contentEquals("3")) {
        	numPassed += 1;
        	System.out.println("chinese button passed");
        } else {
        	numFailed += 1;
        	System.out.println("chinese button failed");
        }
        waiting();
        
        tamilBut.click();
        if (languageVal.getAttribute("value").contentEquals("4")) {
        	numPassed += 1;
        	System.out.println("tamil button passed");
        } else {
        	numFailed += 1;
        	System.out.println("tamil button failed");
        }
        waiting();
        
        educationBut.click();
        if (topVal.getAttribute("value").contentEquals("1")) {
        	numPassed += 1;
        	System.out.println("education button passed");
        } else {
        	numFailed += 1;
        	System.out.println("education button failed");
        }
        waiting();
        
        healthBut.click();
        if (topVal.getAttribute("value").contentEquals("2")) {
        	numPassed += 1;
        	System.out.println("health button passed");
        } else {
        	numFailed += 1;
        	System.out.println("health button failed");
        }
        waiting();
        
        houseBut.click();
        if (topVal.getAttribute("value").contentEquals("3")) {
        	numPassed += 1;
        	System.out.println("house button passed");
        } else {
        	numFailed += 1;
        	System.out.println("house button failed");
        }
        waiting();
        
        accountBut.click();
        if (topVal.getAttribute("value").contentEquals("4")) {
        	numPassed += 1;
        	System.out.println("account button passed");
        } else {
        	numFailed += 1;
        	System.out.println("account button failed");
        }
        waiting();
        
        employmentBut.click();
        if (topVal.getAttribute("value").contentEquals("5")) {
        	numPassed += 1;
        	System.out.println("employment button passed");
        } else {
        	numFailed += 1;
        	System.out.println("employment button failed");
        }
        waiting();
        
        retirementBut.click();
        if (topVal.getAttribute("value").contentEquals("6")) {
        	numPassed += 1;
        	System.out.println("retirement button passed");
        } else {
        	numFailed += 1;
        	System.out.println("retirement button failed");
        }
        
        System.out.println("test Cases Passed: " + numPassed);
        System.out.println("test Cases failed: " + numFailed);
        
        //close Chrome
	    driver.close();
	}

}
