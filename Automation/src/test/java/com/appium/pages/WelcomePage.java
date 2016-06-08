package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.page.objects.WelcomePageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WelcomePage extends CommonAppiumTest {
	//	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	WelcomePageObjects welcomePageObjects = new WelcomePageObjects();

	public WelcomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), welcomePageObjects);
		//runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public void waitForHomePageToLoad() {
		waitForElement(welcomePageObjects.WELCOME_PAGE);
	}

	public String verifyUserIsLoggedIn() {
		return welcomePageObjects.LOGGED_IN_USER.getText();
	}

	public WelcomePage waitForWelcomePage() {
		runnerInfo.waitForHomePage(this);
		return new WelcomePage(driver);

	}


}
