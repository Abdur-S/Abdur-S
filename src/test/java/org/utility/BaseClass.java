package org.utility;

import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {

	public static WebDriver driver;
	
	public static Logger logger;

	public static Properties properties;
	
	public static ExtentReports extentReport;
	
	public static ExtentSparkReporter sparkReport;
	
	public static ExtentTest testCase;

	public static void browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		}
	}

	public static void url(String url) {

		driver.get(url);

	}

	public static void maximize() {

		driver.manage().window().maximize();

	}

	public static void Implicitwait(int seconds) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	public static void elementKeys(WebElement element, String keysToSend) {

		element.sendKeys(keysToSend);

	}

	public static void elementClick(WebElement element) {

		element.click();

	}

	public static void dropDownIndex(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);

	}

	public static void dropDownValue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);

	}

	public static void dropDownText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);

	}

	public static void text(WebElement element) {

		String value = element.getAttribute("value");

		System.out.println("Booking Order No is : " + value);

	}

	public static void quit() {

		driver.quit();

	}

	public static void close() {

		driver.close();
	}

}
