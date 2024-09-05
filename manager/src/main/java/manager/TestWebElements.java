package manager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElements {

	public static void main (String[]args) {
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement username = driver.findElement(By.id("identifierId"));
		username.sendKeys("jkabirm@gmail.com");
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));

		btn.click();
		
		driver.findElement(By.xpath("//div[@id='password']//div[@class='aCsJod oJeWuf']//div[@class='aXBtI Wic03c']//div[@class='Xb9hP']//input[@type='text']")).sendKeys("aaaa");
}
}