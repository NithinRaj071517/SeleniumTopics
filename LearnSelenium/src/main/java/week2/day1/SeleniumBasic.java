package week2.day1;



import org.openqa.selenium.chrome.ChromeDriver;



public class SeleniumBasic {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D://Softwares/ChromeDriver/wen/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		//To open Chrome Browser
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		ChromeDriver driver=new ChromeDriver();
		
		//To load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.get("https://www.leafground.com/table.xhtml/");
		//To maximize
		driver.manage().window().maximize();
		//To get the title
		String tit=driver.getTitle();
		System.out.println(tit);
		//To get current url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.close();
		

	}
}
