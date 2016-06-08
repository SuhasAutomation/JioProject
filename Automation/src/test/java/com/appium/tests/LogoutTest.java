package com.appium.tests;

import org.junit.Test;
import org.testng.Assert;

import com.appium.config.UserBaseTest;
import com.appium.config.UserCredentials;
import com.appium.pages.LoginPage;
import com.appium.pages.LogoutPage;

public class LogoutTest extends UserBaseTest {

	LogoutPage logoutPage;
	UserCredentials credentials;

	@Test	
	public void LogoutTest()
	{
		logoutPage = new LogoutPage(driver);
		String userNameLoggedIn = logoutPage.enterValidCredentails(credentials.getUserName(), credentials.getPassWord())
				.waitForWelcomePage().verifyUserIsLoggedIn();
		Assert.assertEquals(userNameLoggedIn, "suhass");
	}
	
}
