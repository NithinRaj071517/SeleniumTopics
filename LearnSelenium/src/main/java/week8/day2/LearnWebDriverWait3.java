package week8.day2;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LearnWebDriverWait3 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Element']/parent::a")).click();
		System.out.println("clicked");
		driver.findElement(By.xpath("//span[text()='Waits']/parent::a")).click();
		System.out.println("clickesd");
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt98']")).click();
		System.out.println("dsadsa");
		WebElement sys = driver.findElement(By.xpath("//span[text()='I am going to change!']"));
		System.out.println(sys.getText());
		
		WebDriverWait waits= new WebDriverWait(driver, Duration.ofSeconds(9));
		waits.until(ExpectedConditions.invisibilityOf(sys));
		
		String text = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		System.out.println(text);		
	
		
	}
}
