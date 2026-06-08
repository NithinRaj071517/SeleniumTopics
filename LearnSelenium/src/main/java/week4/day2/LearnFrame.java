package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnFrame {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Going inside the Frame using index
		//driver.switchTo().frame(0);

		//Going inside the Frame using WebElement
		WebElement frameElement = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frameElement);
		
		WebElement item1 = driver.findElement(By.xpath("//li[text()=\"Item 1\"]"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()=\"Item 2\"]"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()=\"Item 4\"]"));
		WebElement item7 = driver.findElement(By.xpath("//li[text()=\"Item 7\"]"));
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//Accessing the element inside the frame 
		Actions builder=new Actions(driver);
		builder.keyDown(Keys.CONTROL)
		.click(item1).click(item2).click(item4).click(item7)
		.keyUp(Keys.CONTROL).perform();
		
		//coming out from Frame
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Display as grid")).click();
		System.out.println("cdf");
	}
}
