package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1{
	
	

	@BeforeMethod
	public void browserstart() {
			
			System.out.println("STARTbrowser");
}
	

	@AfterMethod
	public void closebrowser() {
			
			System.out.println("closebrowser");
}
	@Test(priority=2)
	public void login() {
			
			System.out.println("longin");
			

}
	
	@Test
	public void registration() {
			
			System.out.println("getregistration");
}
	
	
	@Test(priority=1)
	public void allow() {
			
			System.out.println("allow me");
}
	
}