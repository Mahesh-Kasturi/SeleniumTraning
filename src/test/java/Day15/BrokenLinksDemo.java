package Day15;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) {
		int noofbrokenlinks =0;
		
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> brokenlinks =driver.findElements(By.tagName("a"));
		for(WebElement brknlink:brokenlinks) {
			String hrefvalue = brknlink.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty()) {
				System.out.println("not possible to check");
				continue;
			}
			URL urlofbrok;
			
			HttpURLConnection conn = (HttpURLConnection)urlofbrok.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefvalue+" is a broken link");
				noofbrokenlinks++;
			}
			else {
				System.out.println("not a broken link");
			}
			
		} 
			
		System.out.println("Total no. of broken links :"+noofbrokenlinks);

	}

}
