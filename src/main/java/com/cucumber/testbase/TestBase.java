package com.cucumber.testbase;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.cucumber.utils.FileHelper;

public class TestBase {

	public WebDriver driver;

	FileHelper fileHelper = new FileHelper();

	public void init() {
		Properties properties = fileHelper.getProperty();
		openBrowser(properties.getProperty("browser"));
		enterUrl(properties.getProperty("baseURL"));
	}

	public void openBrowser(String browserType) {
		if (browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", FileHelper.getResourcePath("/drivers/geckodriver.exe"));
			driver = new FirefoxDriver();
		} else if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", FileHelper.getResourcePath("/drivers/chromedriver.exe"));
			driver = new ChromeDriver();
		} else if (browserType.equals("ie")) {
			System.setProperty("webdriver.ie.driver", FileHelper.getResourcePath("/drivers/IEDriverServer.exe"));
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("browser : " + browserType + " is invalid, Launching chrome as browser of choice..");
			System.setProperty("webdriver.chrome.driver", FileHelper.getResourcePath("/drivers/chromedriver.exe"));
			driver = new ChromeDriver();
		}
	}

	public void enterUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void closeBrowser() {
		driver.close();
	}

}
