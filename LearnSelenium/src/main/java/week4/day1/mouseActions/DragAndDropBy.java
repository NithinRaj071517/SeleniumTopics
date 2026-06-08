package week4.day1.mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement move = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(move);
		
		
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		
		
		Point location = from.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		
		Actions drag=new Actions(driver);
		drag.dragAndDropBy(from, x+10, y+210).perform();
	
		
		
		
	}
}
