package manager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//div[4]/input[1]")).click();
//		for(int i=1;i<4;i++) {
//			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		
		int i=1;
		int count=0;
		while(true) {
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			i++;
			count++;
			System.out.println(count);
		}
		}
	}

