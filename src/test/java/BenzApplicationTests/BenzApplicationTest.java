package BenzApplicationTests;

import static org.junit.Assert.assertNotEquals;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Mercedez.BenzProject.TestUtils.TestBase;
import WebPages.HomePage;

public class BenzApplicationTest extends TestBase {
		
		TestBase tb;
		HomePage hp;
		
		@BeforeTest
		public void setUp()
		{
			tb = new TestBase();
			hp = new HomePage();
			Initialization();
		}
		
		@Test
		public void login() throws Exception
		{			
			hp.BookTestDrive();		
	        assertNotEquals("Vehicle highest and lowestprice is saved in the prices.txt in artifacts folder", highestPrice, lowestPrice);
		}

		
		@AfterTest
		public void close()
		{
			driver.close();
		
		
		}
}
