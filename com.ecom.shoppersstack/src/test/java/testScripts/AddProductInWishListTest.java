package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.CustomListner;
import genericLib.WorkLib;
import pomPages.HomePage;


@Listeners(CustomListner.class)
public class AddProductInWishListTest extends BaseTest{
	
	@Test
	public void addProductToWishList() {
		
		HomePage hp = new HomePage(driver);
		hp.addProductInWishList();
		hp.removeProductFromWishList();
		WorkLib wlib = new WorkLib();
		wlib.handleAlertPopup(driver);
	}
}
