package com.appium.screen.flows;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.pages.LoginPage;
import com.appium.pages.LogoutPage;
import com.appium.pages.WelcomePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AndroidFlow extends CommonAppiumTest implements DeviceInterface {

	public AndroidFlow(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public void login(LoginPage loginPage, String username, String password) {
		loginPage.enterUserAndPassword(username,password);	
		loginPage.signIn();
	}

	public void waitForHomePage(WelcomePage welcomePage) {
		welcomePage.waitForHomePageToLoad();
	}

	public void moveToLogOutScreen() {
		swipeRightUntilTextExists("Disconnect from WordPress.com");
	}

	public void moveToLogOutScreen(WelcomePage welcomePage) {
		// TODO Auto-generated method stub
		moveToLogOutScreen();
	}

	@Override
	public void logout(LogoutPage logoutPage, String username, String password) {
		// TODO Auto-generated method stub
		
	}
}
