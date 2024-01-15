package com.maven.AppiumTest;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class CalculatorTest {
  
	AppiumDriver driver=null;
	
	public static void openCalculator()
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "OPPO CPH2495");
		cap.setCapability("udid", "8LAYZTVCUOZDAQYP");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "14");
		cap.setCapability("appPackage", "com.coloros.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		cap.setCapability("automationName", "UiAutomator2");
		URL url=new URL("http://127.0.0.1:4723");
		driver=new AppiumDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.quit();
	}
	public static void main(String[] args) {
		openCalculator();
	}
}
