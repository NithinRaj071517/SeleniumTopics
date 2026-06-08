package week4.day2;


import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Navigated to window menu from same window
		driver.findElement(By.xpath("(//ul[@class=\"layout-menu\"]/li)[2]")).click();
		driver.findElement(By.linkText("Window")).click();
		
		//Click open to open new window 
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		
		
		
		//It gives the first window results
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		//It gives the second  window results
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//Navigated to window menu from same window
		driver.findElement(By.xpath("(//ul[@class=\"layout-menu\"]/li)[2]")).click();
		driver.findElement(By.linkText("Window")).click();
		String window2 = driver.getWindowHandle();
		System.out.println(window2);
		
		//Click open to open new window 
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		
		//Will give number  of windows opened 
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		System.out.println(windows);
		//Now going to next window
		List<String> list1=new ArrayList<>(windows);
		String wh = list1.get(4);
		driver.switchTo().window(wh);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
}
