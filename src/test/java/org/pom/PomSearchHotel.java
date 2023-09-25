package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PomSearchHotel extends BaseClass {
                   
	public PomSearchHotel() {
                 
		PageFactory.initElements(driver, this);
		
	}
	
	@CacheLookup
	@FindBy(id="location")
	private WebElement dndlocation;
         
	@CacheLookup
	@FindBy(id="hotels")
	private WebElement dndhotels;
	
	
	@CacheLookup
	@FindBy(id="room_type")
	private WebElement dndroomtype;
	
	
	@CacheLookup
	@FindBy(id="room_nos")
	private WebElement dndnoofrooms;
	
	
	@CacheLookup
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	
	@CacheLookup
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	
	@CacheLookup
	@FindBy(id="adult_room")
	private WebElement adults;
	
	
	@CacheLookup
	@FindBy(id="child_room")
	private WebElement childern;
	
	
	@CacheLookup
	@FindBy(id="Submit")
	private WebElement btnsearch;


	
	public WebElement getDndlocation() {
		return dndlocation;
	}



	public WebElement getDndhotels() {
		return dndhotels;
	}



	public WebElement getDndroomtype() {
		return dndroomtype;
	}



	public WebElement getDndnoofrooms() {
		return dndnoofrooms;
	}



	public WebElement getCheckin() {
		return checkin;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getAdults() {
		return adults;
	}



	public WebElement getChildern() {
		return childern;
	}



	public WebElement getBtnsearch() {
		return btnsearch;
	}
	
	
	
	
	
}
