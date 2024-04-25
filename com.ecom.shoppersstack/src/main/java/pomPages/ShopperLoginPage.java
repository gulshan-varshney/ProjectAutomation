package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopperLoginPage extends BaseClass {

	public ShopperLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextfield;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	public void ssLogin(String username, String password) {
		emailTextfield.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		emailTextfield.clear();
	}

}
