package com.app.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.app.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends Base{
	@Before
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	}
	@After
	public void afterMethod() {
		System.out.println("reports");
	}
	public void screenShotFailed(Scenario s) {
		if(s.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File des=new File("/Users/manojkumarg/eclipse-workspace/Hotel_Automation/target/failed.jpeg");
			try {
				FileHandler.copy(screenshotAs, des);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
