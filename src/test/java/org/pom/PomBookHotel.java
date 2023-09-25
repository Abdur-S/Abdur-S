package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PomBookHotel extends BaseClass {
	
	public PomBookHotel() {

		PageFactory.initElements(driver, this);
		
	}
	
	
	@CacheLookup
	@FindBy(id="first_name")
	private WebElement txtfirstname;

	
	@CacheLookup
	@FindBy(id="last_name")
	private WebElement txtlastname;
	
	
	@CacheLookup
	@FindBy(id="address")
	private WebElement txtaddress;
	
	
	@CacheLookup
	@FindBy(id="cc_num")
	private WebElement txtcreditcardnumber;
	
	
	@CacheLookup
	@FindBy(id="cc_type")
	private WebElement dndcctype;
	
	
	@CacheLookup
	@FindBy(id="cc_exp_month")
	private WebElement dndexpmonth;
	
	
	@CacheLookup
	@FindBy(id="cc_exp_year")
	private WebElement dndexpyear;
	
		
	@CacheLookup
	@FindBy(id="cc_cvv")
	private WebElement txtcvvnumber;
	
	
	@CacheLookup
	@FindBy(id="book_now")
	private WebElement btnbooknow;



	public WebElement getTxtfirstname() {
		return txtfirstname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcreditcardnumber() {
		return txtcreditcardnumber;
	}

	public WebElement getDndcctype() {
		return dndcctype;
	}

	public WebElement getDndexpmonth() {
		return dndexpmonth;
	}

	public WebElement getDndexpyear() {
		return dndexpyear;
	}

	public WebElement getTxtcvvnumber() {
		return txtcvvnumber;
	}

	public WebElement getBtnbooknow() {
		return btnbooknow;
	}
	
}
