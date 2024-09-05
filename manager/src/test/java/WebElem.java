import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElem {

	public static void main (String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement we = driver.findElement(By.id("identifierId"));
		we.sendKeys("jkabirm@gmail.com");
		//driver.manage().window().
	}

}
