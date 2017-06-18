package testcase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class loadingpage {
	
	public static void main(String[] args){}
	private AndroidDriver driver;
	private Boolean isInstall=false;
	public void startRecord() throws IOException{
		Runtime rt = Runtime.getRuntime();
//		this code for record the screen of your device
		 rt.exec("cmd.exe /C adb shell screenrecord /sdcard/runCase.mp4");
	}
	
	public void setup()throws Exception{
//		set up appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Device");
        capabilities.setCapability("platformVersion", "4.4");
        // support Chinese
        capabilities.setCapability("unicodeKeyboard", "True");
        capabilities.setCapability("resetKeyboard", "True");
        // no need sign
        capabilities.setCapability("noSign", "True");
        capabilities.setCapability("appActivity", ".ui.activity.GuideActivity");
        capabilities.setCapability("appActivity",".activity.WelcomeActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        startRecord(); 
	}
	
	
//	This Method for swipe Left
	public void swipeToLeft(AndroidDriver driver, int during) {
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        // wait for page loading
    }

//	This Method for swipe right
	public void swipeToRight(AndroidDriver driver,int during){
		int width=driver.manage().window().getSize().width;
		int height=driver.manage().window().getSize().height;
		driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
		
	}
//	This Method for swipe up
	 public void swipeToUp(AndroidDriver driver, int during) {
	        int width = driver.manage().window().getSize().width;
	        int height = driver.manage().window().getSize().height;
	        driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
	        // wait for page loading
	    }
//	 This Method for swipe down
	 public void swipeToDown(AndroidDriver driver, int during) {
	        int width = driver.manage().window().getSize().width;
	        int height = driver.manage().window().getSize().height;
	        driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
	        // wait for page loading
	    }

	       
	}
	       
	        
	        
	        
