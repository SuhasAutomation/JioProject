package com.appium.page.objects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class WelcomePageObjects {

	@iOSFindBy(id = "I'll do this later")
	public MobileElement Skip_This;
	
	@iOSFindBy(id = "tej_reactive_tabbar")
	public MobileElement Profile_Image_Button;

	@AndroidFindBy(id = "org.wordpress.android:id/switch_site")
	@iOSFindBy(className = "I'll do this later")
	@SelendroidFindBy(id = "switch_site")
	public MobileElement WELCOME_PAGE;
	
	@iOSFindBy(className="UIATableCell")
	@AndroidFindBy(id="org.wordpress.android:id/title")
	@SelendroidFindBy(id="title")
    public List<MobileElement> SELECT_BLOG;
	
	@iOSFindBy(accessibility="Me")
	public MobileElement SELECT_ME;

	@AndroidFindBy(id="org.wordpress.android:id/my_site_view_site_text_view")
	@iOSFindBy(id="View Site")
	public MobileElement VIEW_SITE;
	
	@AndroidFindBy(id = "org.wordpress.android:id/my_site_title_label")
	@SelendroidFindBy(id = "my_site_title_label")
	@iOSFindBy(id="I'll do this later")
	public MobileElement LOGGED_IN_USER;

}
