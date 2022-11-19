import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsVsFindElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//findElement() : return single web element
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchBox.sendKeys("XYZ");//sendkeys() will send value to to element
		
		//scenario 1 : locator point to multiple web elements and using findElemend()
		//application te thazhe pokumpol information mu acount enoke oru single footer kanam
		//aa footer inu oru xpath ullu but athinte ullil multiple elements und
		WebElement footer=driver.findElement(By.xpath("//div[@class='footer-block information']"));
		System.out.println("This will print first element in the footer : "+footer.getText());
		
		//Scenario 3 : trying to locate non-exist element using findElement()
		//WebElement searchBox2=driver.findElement(By.xpath("//button[normalize-space()='login']"));//this xpath is not there
		
		//findElements() : return multiple web elements
		List<WebElement> footer2=driver.findElements(By.xpath("//div[@class='footer-upper']"));
		System.out.println("Number ofelements captured : "+footer2.size());//will return number of elements captured	
		
		//If want to do any action in each web elements need to iterate the list
		for(WebElement ele:footer2)
		{
			System.out.println("Get the text of each elemet : "+ele.getText());
		}
		
		//Scenario 1 : locator point to single element
		List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		logo.size();//return only 1
		
		//Scenario 3 : trying to locate non-exist element using findElements()
		List<WebElement> nonExist=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
		System.out.println("No such element present : "+nonExist.size());//return zero instead of throwing exception
	}

}
