package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class CustomListner implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test Started Successfully", true);

	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Test success", true);

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String methodName = result.getMethod().getMethodName();
		String date = new Date().toString().replace(" ", "_").replace(":", "_");
		TakesScreenshot ts = (TakesScreenshot) BaseTest.sdriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screensshot/" + date + "" + methodName + ".png");

		try {
			Files.copy(src, dest);
		} catch (IOException e) {
		}

	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
