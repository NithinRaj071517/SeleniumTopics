package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLeafAps {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement un= driver.findElement(By.id("username"));
		un.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		WebElement log=driver.findElement(By.className("decorativeSubmit"));
		log.click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
}
