package DayTwelve;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class DatePickerTypeOne {
	static void futureDate(WebDriver driver,String month,String year, String date )
	{
		while(true)
		{
			String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentmonth.equals(month)&& currentyear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //this for future date
		}
		
		//reading date
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		for (WebElement dt:dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}
	
	static void pastDate(WebDriver driver,String month,String year, String date) {
		while(true)
		{
			String currentmonth =driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			if(currentmonth.equals(month)&& currentyear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //this for future date
		}
		
		//reading date
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//a"));
		for (WebElement dt:dates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		//futureDate(driver,"September","2025","27");
		pastDate(driver,"September","2000","27");
		
		//String month ="December";
		//String year = "2025";
		//String date = "27";
		// reading or selecting month and year
		
	
	}

}
