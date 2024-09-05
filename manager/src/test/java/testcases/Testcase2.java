package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 {
	@Test
	public void validateTitles() {
	
		String exp = "yahoo.com";
		String actual = "Gmail.com";
//		if(exp.equals(actual)) {
//			System.out.println("testcase passed");
//		}else {
//			System.out.println("failed");
//		}

	Assert.assertEquals(exp, actual);
	Assert.assertTrue(false, "element not found");
	Assert.fail();
	}
	

}
