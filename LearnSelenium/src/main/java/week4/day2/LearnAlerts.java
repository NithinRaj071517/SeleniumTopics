package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//ul[@class=\"layout-menu\"]/li)[2]")).click();
		driver.findElement(By.linkText("Alert")).click();
		//System.out.println("dsa");
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt104\"]")).click();
		Alert alert = driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert.sendKeys("Nithin");
		Thread.sleep(4000);
		alert.accept();
	}
}
