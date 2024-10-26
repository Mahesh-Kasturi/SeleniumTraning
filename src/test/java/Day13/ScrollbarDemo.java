package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollbarDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		//scroll by pixel
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1500)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll the page until the element is visible
		WebElement ele = driver.findElement(By.xpath("//p[contains(text(),'See also: ')][2]"));
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll bottom of the page then move up
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		  //scroll up
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
