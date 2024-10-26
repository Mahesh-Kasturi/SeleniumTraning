package DayEleven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicTablewithpagination {
	
	public static void main(String[] args)
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.clear();
		username.sendKeys("demo");
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.clear();
		password.sendKeys("demo");
		 try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		 try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='#collapse-5']")).click();
		
		
		//ul[@class='collapse show']/li[1]  or //ul[@id='collapse-5']//a[contains(text(), 'Customers')]
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(), 'Customers')]")).click();
		String Pages = driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(), 'Customers')]")).getText();
		int noofpages = Integer.parseInt(Pages.substring(Pages.indexOf(("(")+1,Pages.indexOf("Pages")-1)));
		//capturing all data
		for(int p=1; p<=5; p++)
		{
			if(p>1)
			{
				WebElement activepage = driver.findElement(By.xpath("//ul[@class='pagination']//a[contains(text(),"+p+")]"));
				activepage.click();
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//reading data from page
			int totalrows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			for (int r=1; r<=totalrows; r++)
			{
			 String CustomerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			 String Email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[\"+r+\"]//td[3]")).getText();
			 String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[\\\"+r+\\\"]//td[4]")).getText();
			 System.out.println(CustomerName+"\t"+Email+"\t"+Status);
			}
		}
	}

}
