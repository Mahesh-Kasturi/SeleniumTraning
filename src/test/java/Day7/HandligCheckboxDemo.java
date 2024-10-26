package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandligCheckboxDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// to select the specific checkbox
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		// to select the multiple checkbox
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        //approach 1- using for loop
		//for (int i=0; i<checkboxes.size(); i++)
		//{
		//	checkboxes.get(i).click();
		//}
		//approach 2 - using enhanced for loop
		//	for(WebElement checkbox:checkboxes)
		//	{
		//		checkbox.click();
		//	}
		
		// scenario 3: if if want to select the last 3 checkboxes
		//for(int i=4; i<checkboxes.size(); i++)
		//{
		//	checkboxes.get(i).click();
		//}
			
		// scenario 3: if user want to select the first 3 checkbox
		//	for (int i=0; i<3; i++)
		//	{
		//		checkboxes.get(i).click();
		//	}
		
		//scenario 4: To uncheck the selected checkbox
		for (int i=0; i<checkboxes.size(); i++)
			{
				checkboxes.get(i).click();
			}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected())
			{
			checkboxes.get(i).click();
			}
		}
	}
	

}
