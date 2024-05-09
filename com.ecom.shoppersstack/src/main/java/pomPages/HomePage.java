package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import genericLib.WorkLib;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// identify user setting icon
	@FindBy(xpath = "//*[name()='svg' and @data-testid='SettingsIcon']")
	private WebElement userSettingIcon;

	// identify logout button
	@FindBy(xpath = "//li[text()='Logout']")
	private WebElement logout;

	// identify search text field
	@FindBy(xpath = "//input[@id='search']")
	private WebElement searchTextField;

	// identify search button
	@FindBy(xpath = "//*[name()='svg' and @ id='searchBtn']")
	private WebElement searchIcon;

	// identify men link
	@FindBy(xpath = "//a[@id='men']")
	private WebElement menLink;

	// identify tShirt link
	@FindBy(xpath = "//a[@href='/sub-category/men-tshirt']")
	private WebElement tshirtLink;

	// identify addCart button
	@FindBy(xpath = "//span[text()='Levis Mens Regular Fit Tee']/ancestor::div[@class='featuredProducts_cardFooter__B8KN4']/descendant::button[@id='addToCart']")
	private WebElement addToCartButton;

	// identify cart icon
	@FindBy(xpath = "//*[name()='svg' and @ id='cartIcon']")
	private WebElement cartIcon;

	// identify wishListIcon
	@FindBy(xpath = "(//*[name()='svg' and @ name='addToWishlist'])[1]")
	private WebElement wishList;

	// identify wishList link in setting
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement wishListlink;

	// identify remove from wishlist
	@FindBy(xpath = "//button[text()='remove from wishlist?']")
	private WebElement removeFromWishList;

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getUserSettingIcon() {
		return userSettingIcon;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getMenLink() {
		return menLink;
	}

	public WebElement getTshirtLink() {
		return tshirtLink;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getWishListlink() {
		return wishListlink;
	}

	public WebElement getRemoveFromWishList() {
		return removeFromWishList;
	}

	// logout()
	public void clickOnLogout() {
		userSettingIcon.click();
		logout.click();
	}

	// move mouse at men link
	public void moveMouseToElement(WebDriver driver) {
		WorkLib wlib = new WorkLib();
		wlib.mouseAction(driver, menLink);
		tshirtLink.click();
	}

	// add product in cart
	public void addProductIntoCart() {
		addToCartButton.click();
	}

	public void clickOnCartIcon() {
		cartIcon.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// search product
	public void searchTheProduct(String item) {
		searchTextField.sendKeys(item);
		searchIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// add to WishList
	public void addProductInWishList() {
		wishList.click();
		userSettingIcon.click();
		wishListlink.click();
	}

	// remove product from wishList
	public void removeProductFromWishList() {
		userSettingIcon.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wishListlink.click();
		removeFromWishList.click();
	}

}
