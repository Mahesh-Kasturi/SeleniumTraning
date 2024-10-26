package Day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverMethodsDemo {
	
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String handleone = driver.getWindowHandle();
		System.out.println("The window handle of page 1 :"+handleone);
		String title = driver.getTitle();
		System.out.println("The title of the page is:"+":"+title);
		String URL = driver.getCurrentUrl();
		System.out.println("The URL of the page is:"+":"+URL);
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//Set<String> handles = driver.getWindowHandles();
		//System.out.println("The windows handles are"+handles);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		
	}

}
