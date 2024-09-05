package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowsers {

	public static String browser = "chrome";
	public static WebDriver driver;
	// public static FirefoxDriver driver;

	public static void main(String[] args) {

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

//
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://way2automation.com");
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title.length());
		driver.close();
		// driver.quit();
	}

}
