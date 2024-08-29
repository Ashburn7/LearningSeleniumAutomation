package com.myntrajio.WomensProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenersImplementation.class)
public class WomensProductTest {
	
	@Test(groups = {"FT","RT"})
	public void addproduct() {
		Reporter.log("Womens Product Added Success",true);
	}
	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log("Womens Product Removed Success", true);
	}
	@Test(groups = {"ST","RT"})
	public void updateproduct() {
		Reporter.log("Womens Product Updated Success", true);
	}


}
