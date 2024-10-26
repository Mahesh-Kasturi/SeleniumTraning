package Day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingAlertPrompt {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
	//handling normal alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myalert.accept();
		 // handling confirmation alert - it has ok and cancel button. for ok it is same accept
		
		 driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		 Alert myalerttwo = driver.switchTo().alert();
			System.out.println(myalerttwo.getText());
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			myalerttwo.dismiss();
			
		//Prompr alert
			
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			 Alert myalertthree = driver.switchTo().alert();
				System.out.println(myalertthree.getText());
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				myalertthree.sendKeys("Mahesh");
				myalertthree.accept();
             
	}

}
