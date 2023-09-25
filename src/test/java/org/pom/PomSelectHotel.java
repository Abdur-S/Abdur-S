package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PomSelectHotel extends BaseClass {
	
	public PomSelectHotel() {
		
		PageFactory.initElements(driver,this);
	}
	
	@CacheLookup
	@FindBy(id="radiobutton_0")
	private WebElement btnradio;
	
	@CacheLookup
	@FindBy(id="continue")
	private WebElement btncontinue;


	public WebElement getBtnradio() {
		return btnradio;
	}


	public WebElement getBtncontinue() {
		return btncontinue;
	}

}
