package week4.day1.mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frames = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frames);
		
		WebElement rightClick = driver.findElement(By.xpath("//div[@id='swatch']"));
		
		Actions cl=new Actions(driver);
		cl.contextClick(rightClick).perform();
	}
}
