import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommands {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial");
		driver.navigate().to("https://www.nopcommerce.com/en");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
