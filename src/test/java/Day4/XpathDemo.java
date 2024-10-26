package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		// Relative Xpath with single attribute
		//driver.findElement(By.xpath("//input[@name ='search']")).sendKeys("phone");
		//Relative xpath when tag is unknown
		//driver.findElement(By.xpath("//*[@name ='search']")).sendKeys("abc");
		// Relative Xpath with muliple attribute
		//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Computer");
		//
		// xpath with "and" operator - here both attribute value should match
		
		//driver.findElement(By.cssSelector("//input[@name='search' and @placeholder = 'Search']")).sendKeys("mac");
		
		//xapth with "Or" operator -- here if anyone matches that is enough
		//driver.findElement(By.cssSelector("//input[@name='search' or @placeholder ='Sear']")).sendKeys("maci");
		
		//Xpath with inner text using text() method - can be used when there are no attributes available and only text is availble
		
	    // driver.findElement(By.cssSelector("//*[text()= 'MacBook']")).click();
	   //  String value = driver.findElement(By.cssSelector("//h3[text()='Featured']")).getText();
	   //  System.out.println(value);
	   // Boolean status = driver.findElement(By.cssSelector("//h3[text()='Featured']")).isDisplayed();
	  //  System.out.println(status);
	    
	    //xpath with contains() method
	    //driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("abc");
	    
	    //Xpath with Starts-with() method
	    //driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("abc");
	    
	    //xpath using ends-with() method - this is no more there
	   // driver.findElement(By.xpath("//input[ends-with(@placeholder,'_rch')]")).sendKeys("abc");
	    
	    //Using chained X path
	    Boolean value1 = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	    System.out.println(value1);

	}

}
