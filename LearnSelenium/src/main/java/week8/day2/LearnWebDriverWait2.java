package week8.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LearnWebDriverWait2 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/waits");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		
		WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(20));
		waits.until(ExpectedConditions.alertIsPresent());
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		
	}
}
