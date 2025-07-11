package com.app.exe;

import com.app.base.Base;
import com.app.locator.Loginpage_Locator;

public class LoginPage_exe {
	public static void username(String data) {
		Base.input(Loginpage_Locator.getUsername(), data);
	}
	public static void password(String data) {
		Base.input(Loginpage_Locator.getPassword(), data);
	}
	public static void login() {
		Base.click_value(Loginpage_Locator.getLogin());
	}
	

}
