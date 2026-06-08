package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownPractise2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele2 = driver.findElement(By.id("dropdown"));
		Select fit=new Select(ele2);
		fit.selectByIndex(1);
		
		boolean selected = driver.findElement(By.xpath("//option[@value='1']")).isSelected();
		System.out.println(selected);
		
		WebElement ele1 = driver.findElement(By.id("elementsPerPageSelect"));
		Select set=new Select(ele1);
		set.selectByValue("20");
		
		WebElement ele3 = driver.findElement(By.name("country"));
		Select place=new Select(ele3);
		place.selectByVisibleText("Peru");
		
		List<WebElement> allSelectedOptions1 = place.getAllSelectedOptions();
		for(WebElement ss1:allSelectedOptions1)
		{
			System.out.println(ss1.getText());
		}

	
				

	}
}
