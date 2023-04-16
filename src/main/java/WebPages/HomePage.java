package WebPages;

import java.io.File;
import java.io.FileWriter;
import java.time.Duration;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import Mercedez.BenzProject.TestUtils.TestBase;

public class HomePage extends TestBase {
	
	
	

	
	//webelements
	By shadowCookies = By.xpath("//cmm-cookie-banner");
	By cookiesBanner = By.cssSelector("button.wb-button.wb-button--primary.wb-button--small.wb-button--accept-all");
	By shadowModels =By.xpath("//owc-header");
	By ourModels=By.cssSelector("p[class='owc-header-navigation-topic__label']");
	By shadowHatchback =By.xpath("//vmos-flyout");
	By clickHatchback =By.cssSelector("wb-icon[name ='sportstourer']");
	By clickAClassModels= By.cssSelector("a[href='https://www.mercedes-benz.co.uk/passengercars/models/hatchback/a-class/overview.html']");
	By shadowBuildCar=By.xpath("//owc-stage");
	By clickBuildCar =By.linkText("Build your car");
	By parentShadow=By.xpath("//owcc-car-configurator");
	By shadowFueltype =By.cssSelector("ccwb-multi-select");
	By clickFuelType=By.cssSelector("button[aria-label='Fuel type, selected 0 items']");
	By shadowDiesel =By.cssSelector("ccwb-checkbox");
	By clickDiesel =By.cssSelector("input[name='Diesel']");
	By vehiclePrice=By.cssSelector(" ccwb-text > span");
	
	
	
	
	
	public void BookTestDrive() throws Exception {
		
		       //implicitwait on driver instance
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		
		//Elements are under shadow-root, we have to call first parent of shadow root 
			   //getshadowroot and with its instance main element would be called
			   
	           //cookies accept shadow root element
				WebElement shadowHost = driver.findElement(shadowCookies);
				SearchContext shadowRoot = shadowHost.getShadowRoot();
				WebElement acceptCookies = shadowRoot.findElement(cookiesBanner);
				acceptCookies.click();
				
		       //click on ourModels menu
			    WebElement shadowHost1 = driver.findElement(shadowModels);
				SearchContext shadowRoot1 = shadowHost1.getShadowRoot();
				WebElement ourModelsMenu = shadowRoot1.findElement(ourModels);
				ourModelsMenu.click();
				
				Thread.sleep(3000);
				
				//click on hatchback
				WebElement shadowHost2 = driver.findElement(shadowHatchback);
				SearchContext shadowRoot2 = shadowHost2.getShadowRoot();
				WebElement selectHatchBacks = shadowRoot2.findElement(clickHatchback);
				Actions actions = new Actions(driver); 
		  		actions.moveToElement(selectHatchBacks).click().perform();
		     
		  		
				
				//Webdriverwait and click on A-class hatchbacks
		  		WebelementWaitFromBase(shadowRoot2.findElement(clickAClassModels));
		  		WebElement selectAClassHatchBacks = shadowRoot2.findElement(clickAClassModels);
		  		actions.moveToElement(selectAClassHatchBacks).click().perform();
		  		
		  		
		  		//click on build your car
		  		WebElement shadowHost4 = driver.findElement(shadowBuildCar);
				SearchContext shadowRoot4 = shadowHost4.getShadowRoot();
				WebElement buildCar= shadowRoot4.findElement(clickBuildCar);
				buildCar.click();
				
				//implicit wait doesn't working for shadow-root instance
				Thread.sleep(3000);
				
				//scroll down the page
				JavascriptExecutor Scroll = (JavascriptExecutor) driver;
				Scroll.executeScript("window.scrollBy(0,600)", "");
				
				Thread.sleep(2000);
				
				
				//selecting the filter
		        WebElement shadowHost5 = driver.findElement(parentShadow);
				SearchContext shadowRoot5 = shadowHost5.getShadowRoot();
				WebElement fuelFilter = shadowRoot5.findElement(shadowFueltype);
				SearchContext shadowRoot6 = fuelFilter.getShadowRoot();
				
				//click on fueltype
				WebElement clickFilter = shadowRoot6.findElement(clickFuelType);
				actions.moveToElement(clickFilter).click().perform();
				
				
				//selecting Diesel Fueltype
				WebElement shadowHost7 = fuelFilter.findElement(shadowDiesel);
				SearchContext shadowRoot7 = shadowHost7.getShadowRoot();
				WebElement selectDiesel= shadowRoot7.findElement(clickDiesel);
				actions.moveToElement(selectDiesel).click().perform();
			    actions.moveByOffset(1180, 88).click().build().perform();
				
				
				//take screenshot of the results and save it in a file
				File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(SrcFile, new File(projectPath+"\\Artifacts\\screenshot.png"));
			
				
				// get the prices and save the highest and lowest values in a text file
				 List<WebElement> prices=shadowRoot5.findElements(vehiclePrice);
				 lowestPrice = prices.get(0).getText();
				 highestPrice =prices.get(prices.size() - 1).getText();
				 
				 //writing prices.txt file to that specific location
			     FileWriter writer = new FileWriter(projectPath+"\\Artifacts\\prices.txt");
			     writer.write("Lowest price: " + lowestPrice + "\n");
			     writer.write("Highest price: " + highestPrice);
			     writer.close();
			     
		
	}





	





	
	
}
