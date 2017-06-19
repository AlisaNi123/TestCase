package testcase;

import java.util.*;
import java.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import junit.framework.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;

public class Calculation {
	 private AppiumDriver driver;
    @Before
    public void setup() throws Exception {
       DesiredCapabilities cap = new DesiredCapabilities();
       cap.setCapability(CapabilityType.BROWSER_NAME, "");
     //指定测试平台
       cap.setCapability("platformName", "Android"); 
     //指定测试机的ID,通过adb命令`adb devices`获取
       cap.setCapability("deviceName", "A7J5T15730013352"); 
        cap.setCapability("platformVersion", "4.4");
     //将上面获取到的包名和Activity名设置为值
       cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
     //A new session could not be created的解决方法
       cap.setCapability("appWaitActivity","com.android.calculator2.Calculator");
     //每次启动时覆盖session，否则第二次后运行会报错不能新建session
        cap.setCapability("sessionOverride", true);
       driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
       }
    @Test
    public void plus(){
    	//获取1
        driver.findElementById("com.android.calculator2:id/digit1").click();
        //获取+
        driver.findElementById("com.android.calculator2:id/plus").click();
        //获取2
        driver.findElementById("com.android.calculator2:id/digit2").click();
        //获取=
        driver.findElementById("com.android.calculator2:id/equal").click();
        try {
    		Thread.sleep(5000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
    
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
