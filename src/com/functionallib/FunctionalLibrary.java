package com.functionallib;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.objectrepository.ObjectRepository;

import org.apache.commons.io.FileUtils;

public class FunctionalLibrary {
	WebDriver driver;

	public FunctionalLibrary(WebDriver driver) {
		this.driver = driver;
	}

	public void clickElement(String locator, String locatorType) {
		try {
			if (locatorType.contains("xpath")) {
				driver.findElement(By.xpath(locator)).click();
			} else if (locatorType.contains("id")) {
				driver.findElement(By.xpath(locator)).click();
			} else if (locatorType.contains("name")) {
				driver.findElement(By.xpath(locator)).click();
			} else if (locatorType.contains("linkText")) {
				driver.findElement(By.xpath(locator)).click();
			} else {
				System.out.println("invalid locator");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void inputText(String locator, String locatorType, String value) {
		try {
			if (locatorType.contains("xpath")) {
				driver.findElement(By.xpath(locator)).sendKeys();
			} else if (locatorType.contains("id")) {
				driver.findElement(By.xpath(locator)).sendKeys();
			} else if (locatorType.contains("name")) {
				driver.findElement(By.xpath(locator)).sendKeys();
			} else {
				System.out.println("invalid locator");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void SelectFromDropDown(String xpath, String value) {
		try {
			Select select = new Select(driver.findElement(By.xpath(xpath)));
			select.selectByValue(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void takeScreenShot(WebDriver driver) {
		try {
			//Convert web driver object to TakeScreenshot
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        //Call getScreenshotAs method to create image file
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        //Move image file to new destination
	        File DestFile=new File("C:\\ACT\\ATCAutomation\\screenshot.xls");
	        //Copy file at destination
	        FileUtils.copyFile(SrcFile, DestFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getText(String locator, String locatorType) {
		String text=null;
		try {
			if (locatorType.contains("xpath")) {
				driver.findElement(By.xpath(locator)).getText();
			} else if (locatorType.contains("id")) {
				driver.findElement(By.xpath(locator)).sendKeys();
			} else if (locatorType.contains("name")) {
				driver.findElement(By.xpath(locator)).sendKeys();
			} else {
				System.out.println("invalid locator");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return text;
	}
	
	public void navidateFromMainMenuToSubmenu() {
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath(ObjectRepository.linkWomen))).perform();
		driver.findElement(By.xpath(ObjectRepository.summerDresses)).click();
	}
}