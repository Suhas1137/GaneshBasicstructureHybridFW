package com.Pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpagepom {

	@FindBy(id="email")private WebElement Emailid;
	@FindBy(id="pass")private WebElement Password;
	@FindBy(xpath="//button[@name='login']")private WebElement logbtn;
	public WebElement getEmailid() {
		return Emailid;
	}
	public void setEmailid(WebElement emailid) {
		Emailid = emailid;
	}
	public WebElement getPassword() {
		return Password;
	}
	public void setPassword(WebElement password) {
		Password = password;
	}
	public WebElement getLogbtn() {
		return logbtn;
	}
	public void setLogbtn(WebElement logbtn) {
		this.logbtn = logbtn;
	}
	
	
}
