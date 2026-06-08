package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Element']/parent::a")).click();
		System.out.println("clicked");
		driver.findElement(By.xpath("//span[text()='Waits']/parent::a")).click();
		System.out.println("clickesd");
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
		waits.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
		
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);
		
	}
}
