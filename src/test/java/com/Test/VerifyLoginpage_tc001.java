package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Pageobject.Loginpagepom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class VerifyLoginpage_tc001 extends BaseClass{

	@Test
	public void Verifylogin() {
		Loginpagepom loginpagepom=PageFactory.initElements(driver, Loginpagepom.class);
		
		Library.custom_senkeys(loginpagepom.getEmailid(), "Suhas@123");
		Library.custom_senkeys(loginpagepom.getPassword(), "123456");
		Library.custom_click(loginpagepom.getLogbtn());

		// Github demo practice
	}
}
