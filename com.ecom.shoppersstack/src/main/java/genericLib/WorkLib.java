package genericLib;

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
		
	public static String getName()
	{
		String date = new Date().toString().replace(" ", "_").replace(":", "_");
		String name= "report"+date;
		return date;
	}
	

}
