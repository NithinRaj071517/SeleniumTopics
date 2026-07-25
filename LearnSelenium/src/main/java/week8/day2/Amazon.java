package week8.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[text()='Fulfilment by Amazon']/preceding::li[1]"));
		element.click();
		
		
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Operating agreement')]/following::li[1]"));
		element2.click();
	}
}
