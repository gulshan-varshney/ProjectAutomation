package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.CustomListner;
import genericLib.WorkLib;
import pomPages.HomePage;


@Listeners(CustomListner.class)
public class AddProductInWishListTest extends BaseTest{
	
	@Test()
	public void addProductToWishList() {
		
		//test = report.createTest(name.getName());
		HomePage hp = new HomePage(driver);
		hp.addProductInWishList();
		//test.log(Status.PASS, "product added successfully into wishlist");
		hp.removeProductFromWishList();
		//test.log(Status.PASS, "product removed successfully from wishlist items");
		WorkLib wlib = new WorkLib();
		wlib.handleAlertPopup(driver);
		//test.log(Status.PASS, "Alert handled successfully");
	}
}
