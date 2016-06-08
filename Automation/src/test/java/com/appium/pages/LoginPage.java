package com.appium.pages;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
//import com.appium.config.ViewFactory;
import com.appium.page.objects.LoginPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.logging.LoggingPermission;

import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonAppiumTest {
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public LoginPageObjects loginPageObjects = new LoginPageObjects();

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public WelcomePage enterValidCredentails(String username, String password) {
		runnerInfo.login(this, username, password);
		return new WelcomePage(driver);
	}

	public String validateErrorMessage() {
		return driver.getPageSource();
	}

	public boolean validateUserNameFieldIsDisplayed() {
		return loginPageObjects.username.isDisplayed();
	}

	public void enterUserAndPassword(String user, String pass) {
		// TODO Auto-generated method stub
		waitForPageToLoad(loginPageObjects.username);
		loginPageObjects.username.click();
		loginPageObjects.username.sendKeys(user);
		loginPageObjects.return_keyboard.click();
		loginPageObjects.password.click();
		loginPageObjects.password.sendKeys(pass);
		loginPageObjects.return_keyboard.click();
	}

	public void signIn(){
		loginPageObjects.SignIn_Button.click();
		try {
			Thread.sleep(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void tapLoginButton(){
		loginPageObjects.tutorial_login_Btn.click();
	}

	public void selectProfile() {
		waitForElement(loginPageObjects.Profile_Image_Button).click();
	}


	public void skipBackUp() {
		// TODO Auto-generated method stub
		waitForElement(loginPageObjects.Skip_This).click();
	}
	
	public void settingsScreen(){
		waitForElement(loginPageObjects.Settings_Screen).click();
	}
	
}
