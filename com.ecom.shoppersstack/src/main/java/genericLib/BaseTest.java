package genericLib;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pomPages.HomePage;
import pomPages.ShopperLoginPage;
import pomPages.WelcomePage;

public class BaseTest implements IAutoConstant {

	public static WebDriver sdriver;
	public WebDriver driver;

	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException {

		FLib lib = new FLib();
		String browser = lib.getDataFromPropertyFile(prop_path, "browser");
		String url = lib.getDataFromPropertyFile(prop_path, "url");
		Reporter.log("----Launching " + browser + " browser----", true);

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			Reporter.log("invalid Browser", true);
		}
		sdriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeSeconds));
		driver.get(url);
	}

	@BeforeMethod(alwaysRun = true)
	public void loginIntoSS() throws EncryptedDocumentException, IOException {

		WelcomePage wp = new WelcomePage(driver);
		wp.clickOnLogin();

		FLib lib = new FLib();
		String username = lib.getDataFromExcelFile(excel_path, sheet_name, 1, 0);
		String password = lib.getDataFromExcelFile(excel_path, sheet_name, 1, 1);

		ShopperLoginPage slp = new ShopperLoginPage(driver);
		slp.ssLogin(username, password);

	}

	@AfterMethod(alwaysRun = true)
	public void logoutSS() {
		HomePage hp = new HomePage(driver);
		hp.clickOnLogout();

	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}

}
