package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandleDemo {
	
	public static void main (String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		//Approach1 - converting into list
		List<String> windowlist =new ArrayList(windowhandles);
		String Parentid = windowlist.get(0);
		String Childid = windowlist.get(1);
		// driver switch to child window
		driver.switchTo().window(Childid);
		
		System.out.println(driver.getTitle());
		
		//driver switch to parent window
		driver.switchTo().window(Parentid);
		System.out.println(driver.getTitle());
		
		
		// Approcah 2: if there any many windows then we can use looping statement
		for(String winid:windowhandles) {
			
			String title = driver.switchTo().window(winid).getTitle();
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
			
			
		}
		
	}

}
