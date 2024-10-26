package Day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutosuggesstiondropdownAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.bjs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='What are you looking for today?']")).sendKeys("egg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> list = driver.findElements(By.xpath("//div[@data-cnstrc-item-section='Search Suggestions']"));
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("brown eggs")) {
				list.get(i).click();
				break;
			}
		}
				

	}

}
