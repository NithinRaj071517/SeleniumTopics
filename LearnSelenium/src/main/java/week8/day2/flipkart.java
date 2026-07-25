package week8.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//div[@class='Afujtw']/input)[1]"));
		element.sendKeys("I phone");
		element.sendKeys(Keys.ENTER);
		
		//List<WebElement> elements = driver.findElements(By.xpath("//div[starts-with(text(),'Apple iPhone 16')]/following-sibling::*/following::div[@class='oFEPlD']"));
		List<WebElement> elements = driver.findElements(By.xpath("//div[starts-with(text(),'Apple iPhone 16')]"));
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
			WebElement element2 = driver.findElement(By.xpath("//div[starts-with(text(),'Apple iPhone 16')]/ancestor::div[@class='col col-7-12']/following-sibling::div//div[contains(@class,'hZ3P6w DeU9vF')]"));
			
			System.out.println(element2.getText());
			
			
		}
	}
}
