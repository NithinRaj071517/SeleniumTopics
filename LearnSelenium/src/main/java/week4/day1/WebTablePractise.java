package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractise {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dynamic-table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebElement elementTable= driver.findElement(By.xpath("//div[@class='table-responsive']/table"));
		List<WebElement> elementRows = elementTable.findElements(By.tagName("tr"));
		for (int f = 0; f < elementRows.size(); f++) 
		{
			WebElement elementRalone = elementRows.get(f);
			//System.out.println(elementRalone.getText());
			List<WebElement> elementColsallone = elementRalone.findElements(By.tagName("td"));
			for (int k = 0; k < elementColsallone.size(); k++) 
			{
				WebElement elementColsallone1 = elementColsallone.get(k);
				System.out.print(elementColsallone1.getText()+" | ");
				
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
	}

}
