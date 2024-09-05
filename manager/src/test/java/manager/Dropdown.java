package manager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//List<WebElement> links= driver.findElement(By.tagName("a"));
		
//		for(WebElement link:links) {
//			System.out.println(link.getText()+"url is--"+link.getAttribute("href"));
//		}
		
		//System.out.println(total.size());
	}

}
