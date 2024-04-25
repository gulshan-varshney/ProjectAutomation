package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass {

	
	public WelcomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//identify login button on welcome page
	@FindBy(xpath = "//button[@id='loginBtn']")
	private WebElement loginbtn;

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//click on login
	public void clickOnLogin() {
		loginbtn.click();
	}
	
}
