package com.myntrajio.generic.webdriverlibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverLibrary {
	
	/**
	 * This class contains reusable methods to perform driver related operations
	 */
	
	public WebDriver driver;
	public static WebDriver static_driver;
	public Actions action;
	public Select select;
	
	/**
	 *This Method launches specified browser
	 *
	 *@param browser
	 *@return
	 */
	
	public WebDriver lauchedBrowser(String browser) {
		switch(browser) {
		case "chrome":
			driver = new ChromeDriver();
			static_driver=driver;
			break;                                                                                                                
		case "firefox":
			driver= new FirefoxDriver();
			static_driver=driver;
			break;
		case "edge":
			driver = new EdgeDriver();
			static_driver=driver;
			break;
			default:
				System.out.println("Invalid Browser Info");
		}
		return driver;
	}
	/**
	 * This method maximizes the browser 
	 */
	
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to navigate to the application
	 * 
	 * @param url
	 */
	public void naviagteToApp(String url) {
		driver.get(url);
	}
	
	/**
	 * THis method waits until element or elements is found
	 * 
	 * @param time
	 */
	
	public void waitUtilElementFound(long time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method waits until element is visible on the web page
	 * 
	 * @param time
	 * @param element
	 * @return
	 */
	public void  explicitWait(long time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		 wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * This method is used to close current tab or window
	 */
	public void closeWindow() {
		driver.close();
	}
	
	/**
	 * This method is used to close all the opened tabs or windows
	 */
	
	public void quitWindow() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
