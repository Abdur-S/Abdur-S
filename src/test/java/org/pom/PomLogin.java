package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class PomLogin extends BaseClass {
	
	public PomLogin() {
        
        PageFactory.initElements(driver, this);
	
}

 @CacheLookup
 @FindBy(id="username")
 private WebElement username;
 
 @CacheLookup
 @FindBy(id="password")
 private WebElement password;
 
 @CacheLookup
 @FindBy(id="login")
 private WebElement btnlogin;

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getBtnlogin() {
	return btnlogin;
}
	


}
