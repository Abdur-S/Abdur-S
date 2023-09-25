package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PomConfirmBooking extends BaseClass {
	
	
	public PomConfirmBooking() {

		PageFactory.initElements(driver, this);
		
	}
	
	
	@CacheLookup
	@FindBy(id="order_no")
	private WebElement txtorderno;


	public WebElement getTxtorderno() {
		return txtorderno;
	}

}
