package manager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsElementPrsence {

	public static WebDriver driver;
	public static boolean isElementPresent(String locator) {
		try{driver.findElement(By.xpath(locator));
		return true;} catch(Throwable t)
		{
			return false;
		}
	}
	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.way2automation.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    File sshot = (File) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(sshot, new File("./screeshot/newpage.jpg"));
	
	
	}

}
