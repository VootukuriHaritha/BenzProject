package Mercedez.BenzProject.TestUtils;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestBase {
	
		public static WebDriver driver;
		public static String browser = null; 
		public static Properties prop = null;
		public static FileReader fis;
		public static String projectPath=null;
		public static String highestPrice=null;
		public static String lowestPrice=null;
		
		public TestBase()
		{
			try {
				
				//Getting the Config properties
				prop = new Properties();
				projectPath =System.getProperty("user.dir");
				FileReader fis = new FileReader(projectPath+ "\\src\\main\\java\\Mercedez\\BenzProject\\TestUtils\\config.properties");
				prop.load(fis);
				browser = prop.getProperty("browser");
				projectPath =System.getProperty("user.dir");
			}
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
		
		public void Initialization()
		{
			//Creating new instance of chrome driver
				if(browser.equals("chrome")) 
				{
					WebDriverManager.chromedriver().setup();
			         driver = new ChromeDriver();
			     
				}
				//Creating new instance of edge driver,change browser name in the config.properties file
				
				else if(browser.equals("edge"))
				{
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					
				}
					
			
				 // maximize the window
				driver.manage().window().maximize();
				
				// navigate to the Mercedes-Benz UK website
				driver.get(prop.getProperty("mercedesBenzUrl"));
				
				
		}
		
		
		
}
