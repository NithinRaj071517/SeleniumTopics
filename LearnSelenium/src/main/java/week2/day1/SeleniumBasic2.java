package week2.day1;




import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumBasic2 {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
		
		String attribute = driver.findElement(By.id("errorDiv")).getAttribute("class");
		System.out.println(attribute);
		



	}
}
