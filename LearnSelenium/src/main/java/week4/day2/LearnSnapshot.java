package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//ul[@class=\"layout-menu\"]/li)[2]")).click();
		driver.findElement(By.linkText("Alert")).click();
		//System.out.println("dsa");
		driver.findElement(By.xpath("//button[@id=\"j_idt88:j_idt104\"]")).click();
		Alert alert = driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert.sendKeys("Nithin");
		Thread.sleep(4000);
		alert.accept();
		
		//screenshot of entire page
			File src = driver.getScreenshotAs(OutputType.FILE);
			File dst=new File("./snaps/img2.png");
			FileUtils.copyFile(src, dst);
		
		
		//screenshot of particular element
		File src1 = driver.findElement(By.xpath("//div[@class='layout-topbar']")).getScreenshotAs(OutputType.FILE);
		File dst1=new File("./snaps/img3.png");
		FileUtils.copyFile(src1, dst1);

	}
}
