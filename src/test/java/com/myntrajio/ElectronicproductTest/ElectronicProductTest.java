package com.myntrajio.ElectronicproductTest;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.myntrajio.generic.listenerlibrary.ListenersImplementation.class)
public class ElectronicProductTest {
	
	@Test(groups = {"FT","RT"})
	public void addproduct() {
		Reporter.log("Electronic Product Added Success",true);
	}
	@Test(groups = {"IT","RT"})
	public void removeproduct() {
		Reporter.log("Electronic Product Removed Success", true);
	}
	@Test(groups = {"ST","RT"})
	public void updateproduct() {
		Reporter.log("Electronic Product Updated Success", true);
	}

}
