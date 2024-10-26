package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		// fill a textbox in frame1. first locate the frame
		
	WebElement frameone = 	driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	
	driver.switchTo().frame(frameone);
	driver.findElement(By.xpath("//input[@type='text' and @name ='mytext1']")).sendKeys("abc");
	// after every frame user should again switch back to main page
	driver.switchTo().defaultContent();
	//now check the second frame and add some text value
	 
	WebElement frametwo = 	driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frametwo);
	driver.findElement(By.xpath("//input[@type='text' and @name ='mytext2']")).sendKeys("Mahesh");
	driver.switchTo().defaultContent();
	
	//now frame 3 where there is a inner frame. we will use indexing to switch to frame within frame since there is only one frame
	
	WebElement framethree = 	driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(framethree);
	driver.switchTo().frame(0);  // zero index since there is only frame within frame
	driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();  //->here first unique elemnet is located then moved to exact element.
	driver.switchTo().defaultContent();
		
		

	}

}
