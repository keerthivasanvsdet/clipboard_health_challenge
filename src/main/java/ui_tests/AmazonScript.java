package ui_tests;

import org.testng.annotations.Test;
import pages.Common;
import pages.HomePage;
import pages.ProductListingPage;

public class AmazonScript extends Common {
	
	@Test
	public void amazonWorkFlow() {
		getData();
		LOGGER.info("*******************************************");
		LOGGER.info(" ");
		LOGGER.info("Executing Scenario: " + "Amazon Product Checkout");
		LOGGER.info(" ");
		LOGGER.info("*******************************************");
		LOGGER.info("Product: " + projectProp.get("Name"));
		LOGGER.info("Author: " + projectProp.get("Author"));
		connect();
		launchAppUrl();
		HomePage hp = new HomePage();
		hp.clickHamburgerMenu();
		hp.clickTVAppliancesElectronicMenu();
		hp.clickTelevisionsMenu();
		ProductListingPage plp=new ProductListingPage();
		plp.clickSamsungBrandOption();
		plp.clickSortByOption();
		plp.clickDescendingOption();
		plp.clickSecondTelevisionProduct();
		switchTab();
		plp.assertAndGetContentOfAboutThisItem();
		tearDown();
	}

}
