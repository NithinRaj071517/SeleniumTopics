package week4.day1.mouseActions;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndRelease {


	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.automationtesting.co.uk/actions.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement from = driver.findElement(By.xpath("//p[@id=\"dragtarget\"]"));
		WebElement to = driver.findElement(By.xpath("(//div[@ondragover=\"allowDrop(event)\"])[2]"));
		
		Actions hold=new Actions(driver);
		hold.clickAndHold(from).moveToElement(to).release().perform();
		
		
	
		
		
		
	}
}
