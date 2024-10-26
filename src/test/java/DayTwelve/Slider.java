package DayTwelve;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		WebElement min_slider =driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		System.out.println(min_slider.getLocation()); //59,251 - x-59 , y-251
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 251).perform();
		System.out.println("location after the drag"+min_slider.getLocation());
		

	}

}
