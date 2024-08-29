package com.myntrajio.RegisterTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import com.myntrajio.generic.PageRepository.RegisterPage;
import com.myntrajio.generic.commonlibrary.BaseTest;
import com.myntrajio.generic.javalibrary.JavaLibrary;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenersImplementation.class)
public class RegisterTest extends BaseTest {
	@Test
	public void registerValidData() {
		// Step 1 :: Verify the RegisterPage
		Assert.assertEquals("title", "title", "Verified Register PAge");
		// Step 2 :: Verify the Element
		Assert.assertEquals("element", "element", "Verified Webelement");
		// Step 3 :: Creating an Object for Register Page
		RegisterPage regpage = new RegisterPage(webdriverlib.driver);
		// Step 4 :: Perform Action -- Clear
		regpage.getNametextfield().clear();
		// Step 5 :: Perform Action -- enter Name text field
		regpage.getNametextfield().sendKeys("abcds");
		// Step 6 :: Perform Action -- Enter Email text field
		regpage.getEmailtextfield().sendKeys("abcds322@gmail.com");
		// Step 7 :: Perform Action-- Enter PassWord text field
		regpage.getPasswordtextfield().sendKeys("abcd@#");
		// Step 9 :: Perform Action-- Enter mobile text field
		regpage.getMobiletextfield().sendKeys("9876543210");

		Reporter.log("Register with valid Data Sucess", true);
	}
}
