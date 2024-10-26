package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;


public class CssSelectorDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Tag and id ** can be added without tag name as well
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("abc");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("abc");
		
		//Tag and classname
		driver.findElement(By.cssSelector("class.search-box-text")).sendKeys("abc");
		//driver.findElement(By.cssSelector(".search-box-text ui-autocomplete-input")).sendKeys("abc");
		
		//tag and attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("abc");
		driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("abc");
		//multiple attribute
		driver.findElement(By.cssSelector("input[placeholder='Search store'][autocomplete='off']")).sendKeys("abc");
		
		//tag, class and attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("abc");
		
		
	}

}
