package com.appium.page.objects;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPageObjects {

	@AndroidFindBy(id = "com.rjil.cloud.tej:id/login_username")
	@iOSFindBy(id = "jioid_textfield")
	@SelendroidFindBy(id="nux_username")
	@FindBy(id="user_login")
	public MobileElement username;

	@AndroidFindBy(id = "com.rjil.cloud.tej:id/login_password")
	@iOSFindBy(id = "pwd_textfield")
	@SelendroidFindBy(id="nux_password")
	@FindBy(id="user_pass")
	public MobileElement password;

	@AndroidFindBy(id = "com.rjil.cloud.tej:id/btn_login")
	@iOSFindBy(id = "SignIn_Button")
	@SelendroidFindBy(id="nux_sign_in_button")
	@FindBy(id="wp-submit")
	public MobileElement SignIn_Button;

	@AndroidFindBy(id = "org.wordpress.android:id/nux_url")
	@iOSFindBy(xpath = ".//*[@value='Site Address (URL)']")
	@SelendroidFindBy(id="nux_url")
	public MobileElement server_url;
	
	@AndroidFindBy(id = "org.wordpress.android:id/nux_url")
	@iOSFindBy(id = "return")
	@SelendroidFindBy(id="nux_url")
	public MobileElement return_keyboard;

	@AndroidFindBy(xpath = ".//*[@text='Sign in']")
	@iOSFindBy(id = "tutorial_login_Btn")
	@SelendroidFindBy(id="nux_sign_in_button")
	@FindBy(id="wp-submit")
	public MobileElement tutorial_login_Btn;
	
	@AndroidFindBy(xpath = "")
	@iOSFindBy(id = "skip_auto_backup")
	public MobileElement Skip_This;
	
	@iOSFindBy(id = "identifierProfileIcon")
	public MobileElement Profile_Image_Button;
		
	@iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell[2]")
	public MobileElement Settings_Screen;
}
