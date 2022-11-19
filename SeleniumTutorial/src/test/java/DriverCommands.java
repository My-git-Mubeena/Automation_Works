import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverCommands {
	public static RemoteWebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		System.out.println("Title is :"+driver.getTitle());
		System.out.println("Current url : "+driver.getCurrentUrl());
		System.out.println("Page source : "+driver.getPageSource());
		

	}

}
