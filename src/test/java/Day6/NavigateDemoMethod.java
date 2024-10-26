package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateDemoMethod {

	public static void main(String[] args) {

       WebDriver driver = new EdgeDriver();
       driver.manage().window().maximize();
       driver.navigate().to("https://demo.nopcommerce.com/");
       driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.navigate().back();
       System.out.println(driver.getCurrentUrl());
       driver.navigate().forward();
       System.out.println(driver.getCurrentUrl());
       driver.navigate().refresh();
       

	}

}
