package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebElement elementTable= driver.findElement(By.xpath("//div[@id='j_idt154_content']/table"));
		List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
		for (int i = 0; i < elementRows.size(); i++) 
		{
			WebElement elementR = elementRows.get(i);
			//System.out.println(elementR.getText());
			List<WebElement> elementCols = elementR.findElements(By.tagName("td"));
			for (int j = 0; j < elementCols.size(); j++) 
			{
				WebElement elementC = elementCols.get(j);
				System.out.println(elementC.getText());
			}
		}
		
		
	}

}
