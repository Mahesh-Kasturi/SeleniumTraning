package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
//verifying three items here
//1> Open Browser
//2>Open my store web site
//3>Verify title
//4>Close the browser

public class VerifyTitle {

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/");
		String get_title = driver.getTitle();
		if(get_title.equals("Your Store")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		driver.close(); // closed current tab opened on the browser
		//driver.quit(); closed all the tabs opened on the browser

	}

}
