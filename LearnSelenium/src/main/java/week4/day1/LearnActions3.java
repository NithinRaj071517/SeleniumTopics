package week4.day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions3 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()=\"Item 1\"]"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()=\"Item 2\"]"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()=\"Item 4\"]"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()=\"Item 7\"]"));
		
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL)
		.click(item1).click(item2).click(item4).click(item7)
		.keyUp(Keys.CONTROL).perform();
		
	}
}
