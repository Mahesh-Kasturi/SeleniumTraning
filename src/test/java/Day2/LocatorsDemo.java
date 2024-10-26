package Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {
	
	//Open browser
	//Maximize window
	//Find search box using "name" locator and add some text
	//Find logo using "id" logo locator and verify it is displayed or not
	//click on the tablet link using LinkText or Partial link text -useful for dynamic text like inbox(12)
	//count the number of headers
	//count the number of links present on the page
	//get text and links of a tag

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("search")).sendKeys("mac");
		Boolean logo = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo);
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click(); In partial link partial text is added. if it's a unique then it can be used
        List<WebElement> headers = driver.findElements(By.className("list-inline-item"));
        System.out.println("The number of headers"+" "+headers.size());
        List<WebElement> hyperlinks = driver.findElements(By.tagName("a"));
        int sizeoflinks = hyperlinks.size();
        for(int i=0; i<sizeoflinks; i++)
        {
        	String text = hyperlinks.get(i).getText();
        	String hrefvalue = hyperlinks.get(i).getAttribute("href");
        	System.out.println(text+":"+ hrefvalue);
        }
        
        
        
	}

}
