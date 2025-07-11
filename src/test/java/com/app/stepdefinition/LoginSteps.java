package com.app.stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.Base;
import com.app.exe.LoginPage_exe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps{
	
	@Given("enter the login page")
	public void enter_the_login_page() {
		System.out.println("Login page");
	}

	@When("User enter the username {string}")
	public void user_enter_the_username(String string) {
		 LoginPage_exe.username(string);
	    
	}

	@When("User enter the password {string}")
	public void user_enter_the_password(String string) {
	   LoginPage_exe.password(string);
	}

	@Then("User click the login Button")
	public void user_click_the_login_button() {
	   LoginPage_exe.login();
	}

	@Then("validate the user logged in")
	public void validate_the_user_logged_in() {
		WebElement greeting = Base.driver.findElement(By.id("username_show"));
		   String actualvalue=greeting.getAttribute("value");
		   String expected="Hello Bhuvi1829!";
		   if(actualvalue.equals(expected)) {
			   System.out.println("User logged in Successfully");
		   }else {
			   System.out.println("Failed to login");
		   }

	}

	


}
