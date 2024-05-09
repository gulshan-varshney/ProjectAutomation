package testScripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.CustomListner;
import pomPages.HomePage;

@Listeners(CustomListner.class)
public class SearchProductTest extends BaseTest {

	@Test(description = "verify user should able to search the product")
	public void searchProduct() {

		// test = report.createTest(name.getName());
		HomePage hp = new HomePage(driver);
		hp.searchTheProduct("samsung");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
