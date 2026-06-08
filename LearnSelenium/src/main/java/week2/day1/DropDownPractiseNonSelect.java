package week2.day1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DropDownPractiseNonSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_dropdown']")).click();
		
		
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		drop1.click();
		System.out.println("daa");
		WebElement drop2 = driver.findElement(By.xpath("//option[text()='Puppeteer']"));
		drop2.click();
		System.out.println("dasd");
		

	}
}
