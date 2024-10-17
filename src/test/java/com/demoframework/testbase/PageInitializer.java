package com.demoframework.testbase;

import com.demoframework.pages.LoginPageElements;
import com.demoframework.pages.MainPageElements;

public class PageInitializer extends BaseClass {
	
	public static LoginPageElements loginPageElements;
	public static MainPageElements mainPageElements;

	
	public static void initialize() {
	
		loginPageElements  = new LoginPageElements();
		mainPageElements = new MainPageElements();

}
}