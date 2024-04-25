package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseTest;
import pomPages.CartPage;
import pomPages.HomePage;

public class BuyProductUsingCodTest extends BaseTest {

	@Test
	public void buyProduct() {
		
		HomePage hp = new HomePage(driver);
		hp.addProductIntoCart();
		hp.clickOnCartIcon();
		CartPage cp = new CartPage(driver);
		cp.OrderByCod();
	}
	
}
