import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(5000);
		//using xpath
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//using css selector
		//driver.findElement(By.cssSelector("button[type='submit")).click();
		
		//using tagname
		//driver.findElement(By.tagName("button")).click();
		
		//using link text
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//using partial link text
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
		Thread.sleep(5000);

	}

}

