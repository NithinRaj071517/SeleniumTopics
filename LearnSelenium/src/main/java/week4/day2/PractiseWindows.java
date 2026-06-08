package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseWindows {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/windows/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		String mainWindow = driver.getWindowHandle();
		System.out.println(mainWindow);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> allWindowsList=new ArrayList<String>(allWindows);
		System.out.println(driver.getWindowHandle());
		driver.switchTo().window(allWindowsList.get(1));
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getWindowHandle());
		driver.quit();
		
	}
}
