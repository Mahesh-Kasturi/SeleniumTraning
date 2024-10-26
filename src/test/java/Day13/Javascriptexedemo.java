package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Javascriptexedemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement inputbox = driver.findElement(By.xpath("//input[@placeholder='Enter Name']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','John')", inputbox);
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobutton);
		
	}

}
