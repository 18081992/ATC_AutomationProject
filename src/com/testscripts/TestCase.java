package com.testscripts;

import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.functionallib.FunctionalLibrary;
import com.objectrepository.ObjectRepository;

public class TestCase {
	
	ChromeOptions options;
	WebDriver driver;
	
	@Test
	public void test1() {
		String url = "http://www.google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\JarFiles\\chromedriver.exe");
		
		options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		
		driver = new ChromeDriver(options);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

}
