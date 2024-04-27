package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseTest;
import pomPages.CartPage;
import pomPages.HomePage;

public class BuyProductUsingCreditCard extends BaseTest{
	
	
	@Test()
	public void buyProductWithCreditCard() {
		
		//test = report.createTest(name.getName());
		
		HomePage hp = new HomePage(driver);
		hp.addProductIntoCart();
		hp.clickOnCartIcon();
		
		CartPage cp = new CartPage(driver);
		cp.orderByCreditcard();
	}
}
