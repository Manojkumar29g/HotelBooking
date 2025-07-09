package com.app.stepdefinition;



import com.app.exe.LoginPage_exe;

import io.cucumber.java.en.*;

public class Login_steps {
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
	    
	}

	@Then("User click the login Button")
	public void user_click_the_login_button() {
	   
	}

	

}
