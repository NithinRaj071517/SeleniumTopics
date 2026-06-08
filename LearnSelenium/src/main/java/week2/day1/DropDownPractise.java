package week2.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractise {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_dropdown']")).click();
		
		
		//WebElement drop3 = driver.findElement(By.xpath("//label[@id='j_idt87:city_label']"));
		
		
		
		System.out.println("<!------By Index-----!>");
		WebElement drop1 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select choose1=new Select(drop1);
		List<WebElement> options1 = choose1.getOptions();
		for(WebElement s1:options1)
		{
			System.out.println(s1.getText());
		}
		choose1.selectByIndex(1);
		List<WebElement> allSelectedOptions1 = choose1.getAllSelectedOptions();
		for(WebElement ss1:allSelectedOptions1)
		{
			System.out.println(ss1.getText());
		}
		
		
		//**********************************
		
		System.out.println("<!------By Visible Text-----!>");
		WebElement drop2 = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select choose2=new Select(drop2);
		List<WebElement> options2 = choose2.getOptions();
		for(WebElement s2:options2)
		{
			System.out.println(s2.getText());
		}
		choose2.selectByVisibleText("Cypress");
		List<WebElement> allSelectedOptions2 = choose2.getAllSelectedOptions();
		for(WebElement ss2:allSelectedOptions2)
		{
			System.out.println(ss2.getText());
		}
		
		//**********************************

	}
}
