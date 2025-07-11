package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.Base;

public class Loginpage_Locator extends Base{
	
	public static WebElement getUsername() {
		return driver.findElement(By.id("username")) ;
		
	}
	public static WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public static WebElement getLogin() {
		return driver.findElement(By.id("login"));
	}
	
	}



