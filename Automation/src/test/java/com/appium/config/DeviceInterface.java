package com.appium.config;

import com.appium.pages.LoginPage;
import com.appium.pages.LogoutPage;
import com.appium.pages.WelcomePage;

public interface DeviceInterface {
	
	public void login(LoginPage loginPage, String username,String password);
	
	public void waitForHomePage(WelcomePage welcomePage);
	
	public void logout(LogoutPage logoutPage, String username,String password);
}
