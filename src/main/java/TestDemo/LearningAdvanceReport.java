package TestDemo;

import java.util.Base64;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {

	public static void main(String[] args)
	{
		//Create a Object for SparkReport 
		ExtentSparkReporter spark=new ExtentSparkReporter("./AdvanceReports/report.html");
		
		//configure the report
		spark.config().setDocumentTitle("Regression Test for Registration Testing");
		
		spark.config().setReportName("Regression Suite");
		
		spark.config().setTheme(Theme.DARK);
		
		//create the report 
		ExtentReports report=new ExtentReports();
		
		//Attach the Spark Report and Extent Report
		report.attachReporter(spark);
		
		//configure the system information in Extent Report
		report.attachReporter(spark);
		report.setSystemInfo("Device Name", "Windows");
		report.setSystemInfo("OS", "Windows 11");
		report.setSystemInfo("Browser : ", "Chrome");
		report.setSystemInfo("Browser Version : ", " Chrome-127.0.6533.120");
		
		//Create the Test Information
		ExtentTest test=report.createTest("Regressiontest");
		
		//Steps Information
		
		test.log(Status.INFO, "Launching The Browser Successfull");
		
		test.log(Status.INFO, "Navigating To Application via URL Success");
		
		test.log(Status.PASS, "Verifed the webpage success");
		
		if(true==true) {
			test.log(Status.PASS, "Verified the WebElementis SuccessFull");
		} else {
			test.log(Status.FAIL, "Verified the WebElementis is not displayed");
		}
		test.log(Status.SKIP, "Skipped Successfully");
		
		System.out.println("Execute");
		
		//Flush the Report Information 
		report.flush();
	}
}
