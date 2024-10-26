package Dayten;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//total number of rows
		List<WebElement> ro = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rows =ro.size();
		System.out.println(rows);
		//total number of cols
		List<WebElement> co = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		int colums = co.size();
		System.out.println(colums);
		//read the data from specific col and row 5th row 1st colum
		
		String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(value);
	//Read all data from the table
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=colums; c++)
			{
			String values=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.println(values+"\t");
			}
		}
		// condition - fetch data of book whose author in mukesh
		for(int r=2; r<rows; r++)
		{
			
			String Valueone = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(Valueone.equals("Mukesh"))
			{
				String valuetwo = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(valuetwo+"\t");
			}
			
		}
		int price =0;
     //total price of all books
		for(int r=2; r<rows; r++)
		{
		 String cost = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
		 price  = price+ Integer.parseInt(cost);
		}
		System.out.println(price);
		
	}

}
