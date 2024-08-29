package com.myntrajio.generic.commonlibrary;

import com.myntrajio.generic.PropertyFilelibrary.ReadPropertyfile;
import com.myntrajio.generic.excellibrary.ReadExcelFile;
import com.myntrajio.generic.javalibrary.JavaLibrary;
import com.myntrajio.generic.webdriverlibrary.WebdriverLibrary;

public class ObjectLibrary  {
	public ReadExcelFile excellibrary;
	public JavaLibrary javalibrary;
	public ReadPropertyfile propertyfilelib;
	public WebdriverLibrary webdriverlib;
	
		public void CreateObject()
		{
		 excellibrary= new ReadExcelFile();
		 javalibrary=new JavaLibrary();
		 propertyfilelib=new ReadPropertyfile();
		 webdriverlib=new WebdriverLibrary();
	}

}
