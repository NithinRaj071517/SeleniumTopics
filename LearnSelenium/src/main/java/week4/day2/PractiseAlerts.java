package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseAlerts {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//ul[@class=\"layout-menu\"]/li)[2]")).click();
		driver.findElement(By.linkText("Alert")).click();
		
		
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt104\"]")).click();
		Alert alertPerform = driver.switchTo().alert();
		alertPerform.accept();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']")).click();
		Alert alertPerform1 = driver.switchTo().alert();
		alertPerform1.dismiss();
		
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt106']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt109']")).click();
		System.out.println("sda");
		
		
		
		
		
		

	}
}
