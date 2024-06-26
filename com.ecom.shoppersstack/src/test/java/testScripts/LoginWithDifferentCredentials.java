package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLib.BaseTest;
import genericLib.FLib;
import pomPages.ShopperLoginPage;
import pomPages.WelcomePage;

public class LoginWithDifferentCredentials extends BaseTest {

	@DataProvider(name = "TestData")
	public Object[][] testData() throws EncryptedDocumentException, IOException {
		return FLib.getMultipleDataFromExcelSheet(excel_path, "Invalid");
	}

	@Test(dataProvider = "TestData")
	public void Inlogin(String username, String password) {

		WelcomePage wp = new WelcomePage(driver);
		wp.clickOnLogin();
		
		ShopperLoginPage slp = new ShopperLoginPage(driver);
		slp.ssLogin(username, password);

	}

}
