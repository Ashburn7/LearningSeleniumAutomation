package com.myntrajio.MensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenersImplementation.class)
public class MensProductTest {
	
	@Test(groups = {"FT","RT"})
	public void addproduct() {
		Reporter.log("Mens Product Added Success",true);
	}
	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log("Mens Product Removed Success", true);
	}
	@Test(groups = {"ST","RT"})
	public void updateproduct() {
		Reporter.log("Mens Product Updated Success", true);
	}


}
