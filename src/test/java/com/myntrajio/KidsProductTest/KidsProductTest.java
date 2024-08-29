package com.myntrajio.KidsProductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenersImplementation.class)
public class KidsProductTest {

	@Test(groups = {"FT","RT"})
	public void addproduct() {
		Reporter.log("KidsProduct Added Success",true);
	}
	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log("KidsProduct Removed Success", true);
	}
	@Test(groups = {"ST","RT"})
	public void updateproduct() {
		Reporter.log("KidsProduct Updated Success", true);
	}

}
