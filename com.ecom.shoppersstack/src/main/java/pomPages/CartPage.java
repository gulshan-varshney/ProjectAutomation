package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BaseClass {

	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//identify remove from cart link
	@FindBy(xpath = "//button[text()='Remove from cart']")
	private WebElement removeFromCartLink;
	
	//identify Yes button on popup
	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement yesButton;
	
	//identify Buy now button
	@FindBy(xpath = "//span[text()='Buy Now']")
	private WebElement buyNowButton;
	
	//identify address radio button
	@FindBy(id = "37366")
	private WebElement address;
	
	//identify proceed button on address page
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedAddressButton;
	
	//identify COD button
	@FindBy(xpath = "//input[@value='COD']")
	private WebElement codButton;
	
	//identify credit card radio button
	@FindBy(xpath = "//div[@class='payment_savedDebitCardsBlock__5I7KN']/descendant::input[@class='PrivateSwitchBase-input css-1m9pwf3']")
	private WebElement creditCard;
	
	//identify pin textField
	@FindBy(xpath = "//input[@id='PIN']")
	private WebElement enterPin;
	
	//identify submit Button
	@FindBy(xpath = "//button[@id='Submit']")
	private WebElement submitButton;
	
	//identify proceed button on order page
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedOrderButton;
	
	public WebElement getRemoveFromCartLink() {
		return removeFromCartLink;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	public WebElement getBuyNowButton() {
		return buyNowButton;
	}
	
	public WebElement getAddress() {
		return address;
	}

	public WebElement getProceedAddressButton() {
		return proceedAddressButton;
	}

	public WebElement getCodButton() {
		return codButton;
	}

	public WebElement getProceedOrderButton() {
		return proceedOrderButton;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getEnterPin() {
		return enterPin;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void removeFromCart(WebDriver driver) {
		removeFromCartLink.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		yesButton.click();
	}
	
	public void OrderByCod() {
		
		buyNowButton.click();
		address.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proceedAddressButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proceedOrderButton.click();
	}
	
	public void orderByCreditcard() {
		
		buyNowButton.click();
		address.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		proceedAddressButton.click();
		creditCard.click();
		enterPin.sendKeys("2195");
		submitButton.click();
		proceedOrderButton.click();
		
	}
}
