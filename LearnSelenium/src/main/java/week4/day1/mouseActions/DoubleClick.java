package week4.day1.mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/actions.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement from = driver.findElement(By.xpath("//p[text()='Double Click Here']"));
		
		
		Actions doubleCl=new Actions(driver);
		doubleCl.doubleClick(from).perform();
		
		String text = driver.findElement(By.xpath("//p[text()='Well Done!']")).getText();
		System.out.println(text);
	
		
		
		
	}
}
