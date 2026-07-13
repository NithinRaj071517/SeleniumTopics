package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewWebtable {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//table"));
		List<WebElement> headers = element.findElements(By.tagName("th"));
		
		for(WebElement header:headers)
		{
			String text = header.getText();
			System.out.println(text);
		}
		
		
		List<WebElement> allrows = element.findElements(By.xpath("//table/tbody/tr"));
		int size = allrows.size();
		System.out.println(size);
		
		for (int i = 0; i < size; i++) 
		{
			List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
			String firstname = rows.get(0).getText();
			String lastname = rows.get(1).getText();
			
			System.out.println(firstname+" "+lastname);
			
			if(firstname.equals("Alden")&&lastname.equals("Cantrell"))
			{
				WebElement element2 = rows.get(6).findElement(By.xpath("//span[contains(@id,'edit')]"));
				element2.click();
				System.out.println("pass");
				driver.findElement(By.xpath("//input[@id='salary']")).clear();
				driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("11111");
				driver.findElement(By.xpath("//button[@id='submit']")).click();

				WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(element2));
				
				TakesScreenshot ts= (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File dst=new File("./snaps/int.png");
				FileUtils.copyFile(src, dst);
				break;
			}
			
		}
//		
//		TakesScreenshot ts= (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File dst=new File("./snaps/int.png");
//		FileUtils.copyFile(src, dst);
		
		
		
		
		
	}

}
