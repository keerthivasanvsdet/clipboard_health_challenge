package pages;

import org.openqa.selenium.By;

public class HomePage {
	
	public HomePage() {
		
		if(Common.driver.findElement(By.xpath(Common.locatorsProp.get("HomePageCarousel").toString())).isDisplayed()) {
			Common.LOGGER.info("Home Page is Displayed");
		}else {
			Common.LOGGER.info("Home Page isn't Displayed");
		}

	}
	
	public void clickHamburgerMenu() {

		Common.driver.findElement(By.xpath(Common.locatorsProp.get("HamburgerMenu").toString())).click();
		Common.LOGGER.info("Clicked Hamburger Menu");
	}

	public void clickTVAppliancesElectronicMenu() {

		Common.driver.findElement(By.xpath(Common.locatorsProp.get("TVAppliancesElectronicMenu").toString())).click();
		Common.LOGGER.info("Clicked TVAppliancesElectronic Menu");
	}

	public void clickTelevisionsMenu() {

		Common.driver.findElement(By.xpath(Common.locatorsProp.get("TelevisionsMenu").toString())).click();
		Common.LOGGER.info("Clicked Televisions Menu");
	}




}
