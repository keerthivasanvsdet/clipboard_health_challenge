package pages;

import java.util.HashMap;

import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductListingPage {
	
	static HashMap<String, String> tdpMap=new HashMap<String, String>();
	
	public ProductListingPage() {
		if(Common.driver.findElement(By.xpath(Common.locatorsProp.get("CategoryText").toString())).isDisplayed()) {
			Common.LOGGER.info("ProductListing Page is Displayed");
		}else {
			Common.LOGGER.info("ProductListingPage Page isn't Displayed");
		}
	}
	
	public void clickSamsungBrandOption() {
		Common.driver.findElement(By.xpath(Common.locatorsProp.get("SamsungBrandOption").toString())).click();
		Common.LOGGER.info("Clicked SamsungBrand Option in ProductListing Page");
	}
	
	public void clickSortByOption() {
		Common.driver.findElement(By.xpath(Common.locatorsProp.get("SortByOption").toString())).click();
		Common.LOGGER.info("Clicked SortBy Option in ProductListing Page");
	}
	
	public void clickDescendingOption() {
		Common.driver.findElement(By.xpath(Common.locatorsProp.get("DescendingOption").toString())).click();
		Common.LOGGER.info("Clicked Descending Option in ProductListing Page");
	}
		
	public void clickSecondTelevisionProduct() {
		Common.driver.findElement(By.xpath(Common.locatorsProp.get("SecondTelevisionProduct").toString())).click();
		Common.LOGGER.info("Clicked SecondTelevisionProduct in ProductListing Page");
	}
	
	public void assertAndGetContentOfAboutThisItem() {
		String aboutText=Common.driver.findElement(By.xpath(Common.locatorsProp.get("AboutThisItemText").toString())).getText();
		Assert.assertEquals("About this item",aboutText);
		String aboutContent=Common.driver.findElement(By.xpath(Common.locatorsProp.get("AboutThisItemContent").toString())).getText();
		Common.LOGGER.info("Product About Content: "+aboutContent);
	}
}
