package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PomLogout extends BaseClass {

	public PomLogout() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;

	public WebElement getLogout() {
		return logout;
	}

}
