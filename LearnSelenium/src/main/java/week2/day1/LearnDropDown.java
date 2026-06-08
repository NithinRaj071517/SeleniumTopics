package week2.day1;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();

        // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();

        // Create a HashMap to store user profile preferences
        Map<String, Object> prefs = new HashMap<>();

        // Set the preference to disable password leak detection
        prefs.put("profile.password_manager_leak_detection", false);

        // Add the preferences to ChromeOptions
        options.setExperimentalOption("prefs", prefs);

        // Initialize ChromeDriver with the configured options
        WebDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//To add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement un= driver.findElement(By.id("username"));
		un.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		WebElement log=driver.findElement(By.className("decorativeSubmit"));
		log.click();
		
		//WebDriver driverss = new ChromeDriver(options);

		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Plintron");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithin Raj");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NK");
		//driver.findElement(By.className("smallSubmit")).click();
		
		//To find dropdown
		WebElement drop= driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//To handle the dropdown
		Select dd=new Select(drop);
		
		//To select options from dropdown by visible text
		dd.selectByVisibleText("Employee");
		
		WebElement drop1= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		//To handle the dropdown
		Select dd1=new Select(drop1);
		//To select options from dropdown by value
		dd1.selectByValue("DEMO_MKTG_CAMP");
		
		WebElement drop2= driver.findElement(By.id("createLeadForm_industryEnumId"));
		//To handle the dropdown
		Select dd2=new Select(drop2);
		//To select options from dropdown by index
		dd2.selectByIndex(5);
		
		WebElement drop3= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		drop3.sendKeys("Corporation");
}}
