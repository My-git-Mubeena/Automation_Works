import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWebDriverManager {
	static public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver1=WebDriverManager.chromedriver().create();
		driver1.get("https://www.orangehrm.com/orangehrm-30-day-trial"); 
				
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		System.out.println("Title in ch : chrome"+driver.getTitle());
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		System.out.println("Title in firefix : "+driver.getTitle());
		
		//driver=WebDriverManager.firefoxdriver().create();
		//driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		//Thread.sleep(3000); 

	}

}
