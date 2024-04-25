package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseTest;
import pomPages.HomePage;

public class SearchProductTest extends BaseTest {

	@Test(description = "verify user should able to search the product")
	public void searchProduct() {
		
		HomePage hp = new HomePage(driver);
		hp.searchTheProduct("watch");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
