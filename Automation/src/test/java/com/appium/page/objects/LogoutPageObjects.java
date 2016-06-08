package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LogoutPageObjects {

	@iOSFindBy(id = "logout_btn")
	public MobileElement Logout_button;
	
	@iOSFindBy(id = "Yes")
	public MobileElement Logout_confirm;
}
