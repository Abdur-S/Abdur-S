package org.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.pom.PomBookHotel;
import org.pom.PomConfirmBooking;
import org.pom.PomLogin;
import org.pom.PomLogout;
import org.pom.PomSearchHotel;
import org.pom.PomSelectHotel;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utility.BaseClass;
import org.utility.ReadConfig;



public class TestCase extends BaseClass {

	@BeforeSuite
	private void setUp() throws IOException {

		logger = Logger.getLogger("Adactin Automation");
		PropertyConfigurator.configure("log4j.properties");

		ReadConfig r = new ReadConfig();

		browserLaunch("chrome");

		url(r.getUrl());

		logger.info("URL Opened");

		maximize();

		Implicitwait(30);

	}

	@AfterSuite
	private void tearDown() {

		quit();
		

	}

	@Test(priority = 0)
	private void TC01() throws IOException {

		PomLogin p = new PomLogin();

		ReadConfig r = new ReadConfig();

		elementKeys(p.getUsername(), r.getUsername());

		logger.info("Entered UserName");

		elementKeys(p.getPassword(), r.getPassword());

		logger.info("Entered Password");

		elementClick(p.getBtnlogin());

		logger.info("Login Successfull");

	}

	@Test(priority = 1)
	private void TC02() {
		PomSearchHotel ps = new PomSearchHotel();

		logger.info("Search Hotel Page");

		dropDownIndex(ps.getDndlocation(), 1);

		dropDownIndex(ps.getDndhotels(), 2);

		dropDownIndex(ps.getDndroomtype(), 2);

		dropDownIndex(ps.getDndnoofrooms(), 2);

		elementKeys(ps.getCheckin(), "28/07/2023");

		elementKeys(ps.getCheckout(), "29/07/2023");

		dropDownIndex(ps.getAdults(), 1);

		dropDownIndex(ps.getChildern(), 0);

		elementClick(ps.getBtnsearch());

	}

	@Test(priority = 2)
	private void TC03() {

		PomSelectHotel sh = new PomSelectHotel();

		logger.info("Select Hotel Page");

		elementClick(sh.getBtnradio());
		elementClick(sh.getBtncontinue());

	}

	@Test(priority = 3)
	private void TC04() {

		PomBookHotel bh = new PomBookHotel();

		logger.info("Book Hotel Page");

		elementKeys(bh.getTxtfirstname(), "Admin");
		elementKeys(bh.getTxtlastname(), "admin01");
		elementKeys(bh.getTxtaddress(), "India");
		elementKeys(bh.getTxtcreditcardnumber(), "1234567890987654");

		dropDownIndex(bh.getDndcctype(), 3);
		dropDownIndex(bh.getDndexpmonth(), 6);
		dropDownIndex(bh.getDndexpyear(), 16);

		elementKeys(bh.getTxtcvvnumber(), "9887");

		elementClick(bh.getBtnbooknow());

	}

	@Test(priority = 4)
	private void TC05() {

		PomConfirmBooking cb = new PomConfirmBooking();

		logger.info("Confirm Hotel Booking");

		logger.info(" Booking Order No Generated Successfully ");

		text(cb.getTxtorderno());

	}

	@Test(priority = 5)
	private void TC06() {

		PomLogout p = new PomLogout();
		elementClick(p.getLogout());

		logger.info("Logged Out Successfully");

	}

}
