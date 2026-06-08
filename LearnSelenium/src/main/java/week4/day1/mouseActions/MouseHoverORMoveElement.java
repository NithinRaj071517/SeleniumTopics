package week4.day1.mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverORMoveElement {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement element = driver.findElement(By.xpath("//div[@id='1']"));
		
		
		Actions move=new Actions(driver);
		move.moveToElement(element).click().perform();
		System.out.println("ds");
	}
}
