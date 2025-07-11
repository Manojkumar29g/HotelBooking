package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	
public static WebDriver driver = null;
	
	public static void browserlaunch() {
		
		driver.get("https://adactinhotelapp.com/");
	}
	public static void input(WebElement element,String data) {
		element.sendKeys(data);
	}
	public static void click_value(WebElement element) {
		element.click();
	}
	

}
