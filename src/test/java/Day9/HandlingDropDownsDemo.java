package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingDropDownsDemo {

	public static void main(String[] args) {
		//handling auto suggestion drop down using xpath and for loop
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox'  and @class='G43f7e']//li//div[@role='option']"));
			System.out.println(list.size());
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium")) {
				list.get(i).click();
				break;
			}
					
		}
	}

}
