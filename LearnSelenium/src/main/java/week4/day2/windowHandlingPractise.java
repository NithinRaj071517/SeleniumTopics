package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlingPractise {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigated to window menu from same window
		driver.findElement(By.xpath("(//ul[@class=\"layout-menu\"]/li)[2]")).click();
		driver.findElement(By.linkText("Window")).click();
		
		
		String firstWindow = driver.getWindowHandle();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(firstWindow);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		
		
		Set<String> secondWindow = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(secondWindow); 
		String sh=list.get(1);
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(sh);
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(firstWindow);
		System.out.println(driver.getWindowHandle());
		driver.close();
		list.clear();
	
		
	}
}
