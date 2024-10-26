package Day14;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) {
	   WebDriver driver = new EdgeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.makemytrip.com/");
	   driver.manage().window().maximize();
	  /* TakesScreenshot ts =(TakesScreenshot) driver;
	   File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	   File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\takescreenhot.png");
	   sourcefile.renameTo(targetfile);
	   */
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
	   WebElement qr =driver.findElement(By.xpath("//img[@class='appSprite icQRCode']"));
       File srcfile = qr.getScreenshotAs(OutputType.FILE);
       File trgfile = new File(System.getProperty("user.dir")+"\\Screenshot\\qrscreen.png");
       srcfile.renameTo(trgfile);
	}

}
