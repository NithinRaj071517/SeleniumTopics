package week4.day1.keyboardActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/key-presses");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		System.out.println("dsq");
		WebElement element = driver.findElement(By.xpath("//input[@id='target']"));
		
		Actions key = new Actions(driver);
		key.moveToElement(element).click().sendKeys("aaS").perform();
		key.moveToElement(element).keyDown(Keys.CONTROL).perform();
		key.moveToElement(element).keyDown(Keys.LEFT_SHIFT).perform();
		//key.moveToElement(element).keyDown(Keys.ESCAPE).perform();
		System.out.println("sada");
	}
}
