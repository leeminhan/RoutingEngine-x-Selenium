package ESCSeleniumTesting;

//WebDriver Class is needed to instantiate a browser with a specific driver
import org.openqa.selenium.*;
//ChromeDriver is attached to Webdriver to instantitate a chrome browser
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.*;
import java.net.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;

public class UIWalkthrough_Test {
	
	
	public static void main(String[] args) {
		// Instantiation of Chrome Driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/xavierrocker/Downloads/chromedriver_win322/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// launch Chrome and direct it to the Base URL
		driver.get("http://192.168.56.1:3000/");
		
		//Type of Problem Elements
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
	    
	    //Mode of Communication Elements
	    WebElement chatBut = driver.findElement(By.id("Radioimg"));
	    WebElement videoBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[2]"));
	    WebElement voiceBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[3]"));
	    WebElement checkcomms = driver.findElement(By.name("chatMode"));
	    
	    String chat = "1", video= "2", voice= "3";
	    
	    //Language Elements
	    WebElement engBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[4]"));
	    WebElement malBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[5]"));
	    WebElement chiBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[6]"));
	    WebElement tamBut = driver.findElement(By.xpath("(//img[@id='Radioimg'])[7]"));
	    WebElement checklang = driver.findElement(By.name("language"));
	    
	    String eng = "1", mal = "2", chi = "3", tam = "NaN";
	    
	    //Name Elements
	    WebElement firstForm = driver.findElement(By.name("FirstName"));
	    WebElement secForm = driver.findElement(By.name("LastName"));
	    
	    String firstName ="Calvin", secName = "Jean";
	    
	    
	    // TEST1
	    
	   // Input Last Name "Calvin"
	    firstForm.sendKeys("Calvin");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	   // Input Last Name "Jean"
	    secForm.sendKeys("Jean");
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	    
	    //Click Video Option from Mode of Communication
	    videoBut.click();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    
	    //Click English Language
	    engBut.click();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //Click option 4 of TOP
	    opt4But.click();
	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //Check TEST1 Pass or Fail
	    if(firstForm.getAttribute("value").contentEquals(firstName) && secForm.getAttribute("value").contentEquals(secName) && checklang.getAttribute("value").contentEquals(eng) && checkcomms.getAttribute("value").contentEquals(video) && checker4But.isSelected()==true) {
	    	System.out.println("Test 1: Check valid input, Passed!");
	    	
	    }else {
	    	System.out.println("Test 1 Failed");
	    }
	    
	  //close Chrome
	    driver.close();
    
	}

}
