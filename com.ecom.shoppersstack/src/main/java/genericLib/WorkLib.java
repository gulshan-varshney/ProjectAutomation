package genericLib;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WorkLib {

	public void mouseAction(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void handleAlertPopup(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public static String getName() {
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sdf.format(dateObj);
		String name = "report" + currentDate;
		return currentDate;
	}

}
