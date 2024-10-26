package DayTwelve;

import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerComplexone {
	
	//user defined method to make month from string to -Month
	static Month convertMonth(String month) {
		HashMap<String,Month> monthmap = new HashMap<String,Month>();
		monthmap.put("January",Month.JANUARY);
		monthmap.put("February",Month.FEBRUARY);
		monthmap.put("March",Month.MARCH);
		monthmap.put("April",Month.APRIL);
		monthmap.put("May",Month.MAY);
		monthmap.put("June",Month.JUNE);
		monthmap.put("July",Month.JULY);
		monthmap.put("August",Month.AUGUST);
		monthmap.put("September",Month.SEPTEMBER);
		monthmap.put("October",Month.OCTOBER);
		monthmap.put("November",Month.NOVEMBER);
		monthmap.put("December",Month.DECEMBER);
		Month vmonth = monthmap.get(month);
		if(vmonth==null)
		{
			System.out.println("invalid month");
		}
		return vmonth;
	}
    static void selectdate(WebDriver driver, String requiredyear, String requiredmonth, String requireddate)
        
    {
    	WebElement yeardropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectyear = new Select(yeardropdown);
		selectyear.selectByVisibleText(requiredyear);
		
    	String displayedmonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).getAttribute("value");
		//compare requiredmonth and displayedmonth into Month Objects
		Month expectedmonth = convertMonth(requiredmonth);
		Month currentmonth = convertMonth(displayedmonth);
		//compare
		while(true) {
		int result = expectedmonth.compareTo(currentmonth); // - this will be difference of expected month-curent month value;
		if(result>0)
		{
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
		else if(result<0)
		{
			driver.findElement(By.xpath("ui-icon ui-icon-circle-triangle-w")).click();
		}
		else
		{
			break;
		}
    }
		//date selection
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(requireddate))
			{
				dt.click();
				break;
			}
		}
    }

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String requiredyear = "2025";
		String requiredmonth = "June";
		String requireddate = "27";
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
	    selectdate(driver,requiredyear,requiredmonth,requireddate);
	
	}
}


