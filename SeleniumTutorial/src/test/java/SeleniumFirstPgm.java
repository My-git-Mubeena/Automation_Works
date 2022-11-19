import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstPgm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Justin\\eclipse-workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		System.setProperty("webdriver.gecko.driver" , "C:\\Users\\Justin\\eclipse-workspace\\drivers\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		driver2.get("https://www.saucedemo.com/");
	}

}
 