package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	
	
	String msg;
	ChromeDriver driver;
	@Given("Open the Chrome browser")
	public void openBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@And("Load the application URL as {string}")
	public void loadURL(String url) 
	{
		driver.get(url);
	}
	
	@And("Enter the username as {string}")
	public void username(String un) 
	{
		driver.findElement(By.id("username")).sendKeys(un);
	}
	
	@And("Enter the password as {string}")
	public void pwd(String pass) 
	{
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@And("Enter the username as {string} and password as {string}")
	public void enterPwd(String user,String pwd)
	{
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	
	@When("Click on submit button")
	public void loginButton() 
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify the Welcome message in the homepage")
	public void verify() 
	{
		System.out.println("Message verified");
	}
	
	@But("Verify the error message in the homepage")
	public void verifyError() 
	{
		System.out.println("Message not verify verified");
	}
	
	@Then("Get Welcome message")
	public void getMessage()
	{
		String text1 = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text1);
		msg=text1;
	}
	
	@And("Verify Welcome message")
	public void verifyMessage() 
	{
		String expected="Welcome";
		if(msg.contains(expected))
		{
			System.out.println("Verified");
		}
	}
	
	@Given("Close the browser")
	public void closeBrowser()
	{
		driver.close();
		
	}
}
