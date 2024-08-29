package com.myntrajio.generic.listenerlibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.myntrajio.generic.commonlibrary.BaseTest;

public class ListenersImplementation extends BaseTest implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Reporter.log("Taking Screenshot start:" + name, true);

		// convert driver type into take screenshot type(Type casting)
		TakesScreenshot ts = (TakesScreenshot) webdriverlib.static_driver;

		// Take the screenshot and store it in temporary file
		File tempfile = ts.getScreenshotAs(OutputType.FILE);

		// create a file to save image format
		File destfile = new File("./src/test/resources/screenshot/" + name + ".png");

		// copy the file from temporary file to dest file
		try {
			FileHandler.copy(tempfile, destfile);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("Taking screenshot completed :" + name, true);
		}
	}


