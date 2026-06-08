package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseFrames {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practice-automation.com/iframes/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='iframe-1']"));
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@id='iframe-2']"));
		
		
		
		driver.switchTo().frame(frame1);
		String text1 = driver.findElement(By.xpath("//span[@class='highlight_gXVj']")).getText();
		System.out.println("<!-----------Frame1---------!>");
		System.out.println(text1);
		
		driver.switchTo().defaultContent();
		String text2 = driver.findElement(By.xpath("//p[@class='wp-block-paragraph']")).getText();
		System.out.println("<!-----------ParentFrame---------!>");
		System.out.println(text2);
		
		driver.switchTo().frame(frame2);
		String text3 = driver.findElement(By.xpath("//h4[text()='Selenium WebDriver']")).getText();
		System.out.println("<!-----------Frame2---------!>");
		System.out.println(text3);
		
		driver.switchTo().parentFrame();
		String text4 = driver.findElement(By.xpath("//h1[@itemprop='headline']")).getText();
		System.out.println("<!-----------ParentFrame---------!>");
		System.out.println(text4);
		
	}
}
