package com.appium.screen.flows;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.pages.LoginPage;
import com.appium.pages.LogoutPage;
import com.appium.pages.WelcomePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class iOSFlow extends CommonAppiumTest implements DeviceInterface {

	public iOSFlow(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public void login(LoginPage loginPage, String username, String password) {
		loginPage.tapLoginButton();
		loginPage.enterUserAndPassword(username,password);	
		loginPage.signIn();
		loginPage.skipBackUp();	
		loginPage.selectProfile();
		loginPage.settingsScreen();
	}

	public void waitForHomePage(WelcomePage welcomePage) {
		// TODO Auto-generated method stub	
		
	}

	@Override
	public void logout(LogoutPage logoutPage, String username, String password) {
		// TODO Auto-generated method stub
		logoutPage.swipeDown();
		logoutPage.logOutButton();
		logoutPage.logOutConfirm();	
	}
}
