package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseTest;
import pomPages.CartPage;
import pomPages.HomePage;

public class addAndEditCartTest extends BaseTest {

	@Test()
	public void addProductToCart() {

		HomePage hp = new HomePage(driver);

		hp.addProductIntoCart();
		// test.log(Status.PASS, "product added into cart");
		hp.clickOnCartIcon();

		CartPage cp = new CartPage(driver);
		cp.removeFromCart(driver);
		// test.log(Status.PASS, "product removed from cart");
	}
}
