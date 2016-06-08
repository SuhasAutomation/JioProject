package com.appium.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.LoginPageObjects;
import com.appium.page.objects.LogoutPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LogoutPage extends CommonAppiumTest {
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public LogoutPageObjects logoutPageObjects = new LogoutPageObjects();
	
	public LogoutPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), logoutPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
		// TODO Auto-generated constructor stub
	}
	
	public WelcomePage enterValidCredentails(String username, String password) {
		runnerInfo.logout(this, username, password);
		return new WelcomePage(driver);
	}
	
	public void logOutButton() {
		// TODO Auto-generated method stub
		waitForElement(logoutPageObjects.Logout_button).click();
	}
	
	public void logOutConfirm(){
		waitForElement(logoutPageObjects.Logout_confirm).click();
	}
	
}
