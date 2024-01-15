package com.maven.AppiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class program_3 {

	@Test
	
	public void test() throws MalformedURLException, InterruptedException {
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("Janki");
		options.setApp("C:\\Users\\dmin\\OneDrive\\Documents\\Appium\\Generl-Store.apk");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);
		Thread.sleep(10000);
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Janki");
		Thread.sleep(10000);
	    driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	 	Thread.sleep(10000);
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).sendKeys("India");
		Thread.sleep(10000);
		driver.quit();		
	}
}


